package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.Action;

import java.util.*;

public class NFAEdge {
    private final boolean isEpsilon;
    private final TreeSet<Character> chars;
    private final List<Action> actions;

    public NFAEdge(boolean isEpsilon) {
        this.isEpsilon = isEpsilon;
        this.chars = new TreeSet<>();
        this.actions = new ArrayList<>();
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
        if (this.actions.contains(action)) {
            throw new IllegalStateException("Cannot add an action multiple times to an epsilon edge");
        }
        actions.add(action);
    }

    public List<Action> getActions() {
        return Collections.unmodifiableList(actions);
    }
}
