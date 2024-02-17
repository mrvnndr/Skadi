package de.mrvnndr.skadi;

import java.util.Objects;

public class NFANode {
    private final int id;
    private boolean start;
    private boolean accepting;

    public NFANode(int id) {
        this.id = id;
        this.start = false;
        this.accepting = false;
    }

    public int getId() {
        return id;
    }

    public boolean isStart() {
        return start;
    }

    public boolean isAccepting() {
        return accepting;
    }

    public NFANode setStart(boolean start) {
        this.start = start;
        return this;
    }

    public NFANode setAccepting(boolean accepting) {
        this.accepting = accepting;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NFANode nfaNode = (NFANode) o;
        return id == nfaNode.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
