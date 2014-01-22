package StatePattern;

public class Context
{
//    public final static State STATE1 = new ConcreateState1();
//    public final static State STATE2 = new ConcreateState2();

    public State              state;

    public final State getState()
    {
        return state;
    }

    public final void setState(State state)
    {
        this.state = state;
        this.state.setContext(this);
    }

    public void handle()
    {
        this.state.handler();
    }

}
