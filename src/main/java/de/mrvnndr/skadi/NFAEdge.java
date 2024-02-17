package de.mrvnndr.skadi;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NFAEdge {
    private final boolean isEpsilon;
    private final TreeSet<Character> chars;

    public NFAEdge(boolean isEpsilon) {
        this.isEpsilon = isEpsilon;
        this.chars = new TreeSet<>();
    }

    public void insertChar(char c) {
        chars.add(c);
    }

    public void insertAll(Collection<Character> chars) {
        this.chars.addAll(chars);
    }

    public NavigableSet<Character> getChars() {
        return Collections.unmodifiableNavigableSet(chars);
    }

    public boolean isEpsilon() {
        return isEpsilon;
    }
}
