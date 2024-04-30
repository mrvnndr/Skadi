package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.analysis.antlr.SkadiRegexBaseListener;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexListener;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public record ParsedRegex(String id, SkadiRegexParser.RegexContext parseTree) {
    public void walkTree(SkadiRegexListener listener) {
        var walker = new ParseTreeWalker();
        walker.walk(listener, parseTree);
    }

    public Set<String> getDependencies() {
        var depParser = new FragmentDependencyParser();
        walkTree(depParser);
        return depParser.getDependencies();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParsedRegex that = (ParsedRegex) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    private static class FragmentDependencyParser extends SkadiRegexBaseListener {
        private final Set<String> dependencies = new HashSet<>();

        public Set<String> getDependencies() {
            return Collections.unmodifiableSet(dependencies);
        }

        @Override
        public void exitAtomRuleReference(SkadiRegexParser.AtomRuleReferenceContext ctx) {
            dependencies.add(ctx.rule_reference().rule_name().getText());
        }
    }
}
