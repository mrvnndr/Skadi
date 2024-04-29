package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.synthesis.EpsilonFreeNFA;

import java.util.Objects;

public abstract class Action {
    final String code;
    final ActionLocator locator;
    final int id;

    Action(String code, ActionLocator locator, int id) {
        this.code = code;
        this.locator = locator;
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public ActionLocator getLocator() {
        return locator;
    }

    public abstract void apply(EpsilonFreeNFA nfa);

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return id == action.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
