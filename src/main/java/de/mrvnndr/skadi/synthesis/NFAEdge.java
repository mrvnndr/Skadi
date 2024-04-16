package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.Action;

import java.util.*;

public class NFAEdge {
    private final boolean isEpsilon;
    private final TreeSet<Character> chars;
    private final Set<Action> actions;

    public NFAEdge(boolean isEpsilon) {
        this.isEpsilon = isEpsilon;
        this.chars = new TreeSet<>();
        this.actions = new HashSet<>();
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

    public void addAction(Action action) {
        if (this.isEpsilon) {
            throw new IllegalStateException("Cannot add an action to an epsilon edge");
        }
        actions.add(action);
    }

    public Set<Action> getActions() {
        return Collections.unmodifiableSet(actions);
    }
}
