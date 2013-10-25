package StrategyPattern;

public class Client
{
    public static void main(String[] args)
    {
        Context context = new Context(new BackDoor());
        context.operator();
        context = new Context(new BlockEnemy());
        context.operator();
        context = new Context(new GreenLight());
        context.operator();
    }
}
