package StatePattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreateState1());
        context.handle();
        context.setState(new ConcreateState2());
        context.handle();

    }
}
