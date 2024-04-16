package de.mrvnndr.skadi.analysis;


import de.mrvnndr.skadi.analysis.antlr.SkadiRegexBaseListener;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexParser;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FragmentDependencyParser extends SkadiRegexBaseListener {
    private final Set<String> dependencies = new HashSet<>();

    public Set<String> getDependencies() {
        return Collections.unmodifiableSet(dependencies);
    }

    @Override
    public void exitAtomRuleReference(SkadiRegexParser.AtomRuleReferenceContext ctx) {
        dependencies.add(ctx.rule_reference().rule_name().getText());
    }
}
