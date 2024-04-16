package de.mrvnndr.skadi.analysis;

import java.util.ArrayList;
import java.util.List;

public class ActionLocator {
    private final List<String> path;

    public ActionLocator(String automatonName) {
        this.path = List.of(automatonName);
    }

    public ActionLocator(List<String> path) {
        if (path.isEmpty()) {
            throw new IllegalArgumentException("Empty path in ActionLocator!");
        }
        this.path = List.copyOf(path);
    }

    public ActionLocator withPrefix(ActionLocator prefix) {
        var lst = new ArrayList<String>();
        lst.addAll(prefix.path);
        lst.addAll(this.path);
        return new ActionLocator(lst);
    }

    public ActionLocator withSuffix(ActionLocator suffix) {
        var lst = new ArrayList<String>();
        lst.addAll(this.path);
        lst.addAll(suffix.path);
        return new ActionLocator(lst);
    }

    public String definitionName() {
        return path.getLast();
    }

    public String automatonName() {
        return path.getFirst();
    }

    public int getSize() {
        return path.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionLocator that = (ActionLocator) o;
        return path.equals(that.path);
    }

    @Override
    public String toString() {
        return String.join(".", path);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
