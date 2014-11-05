package IntermediariesPattern;

public class Client {

    public static void main(String[] args) {
        AbstarctMediator mediator = new Mediator();
        mediator.execute("buy", 1);
        mediator.execute("sell", 2);
        mediator.execute("offsell", 3);
        mediator.execute("clear", 4);
    }

}
