package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.analysis.antlr.SkadiRegexListener;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Objects;

public record ParsedRegex(String id, SkadiRegexParser.RegexContext parseTree) {
    public void walkTree(SkadiRegexListener listener) {
        var walker = new ParseTreeWalker();
        walker.walk(listener, parseTree);
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
}
