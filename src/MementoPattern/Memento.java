package MementoPattern;

public class Memento
{
    private String state;

    public Memento(String state)
    {
        super();
        this.state = state;
    }

    public final String getState()
    {
        return state;
    }

    public final void setState(String state)
    {
        this.state = state;
    }

}
