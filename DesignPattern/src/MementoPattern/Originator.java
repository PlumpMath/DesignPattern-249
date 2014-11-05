package MementoPattern;

public class Originator {
    private String state = "";
    private Memento memento;

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }

    public final Memento getMemento() {
        return memento;
    }

    public final Memento setMemento() {
        return new Memento(state);
    }

}
