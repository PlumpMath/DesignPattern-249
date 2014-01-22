package MementoPattern;

public class Caretaker
{
    private Memento memento;

    public final Memento getMemento()
    {
        return memento;
    }

    public final void setMemento(Memento memento)
    {
        this.memento = memento;
    }
}
