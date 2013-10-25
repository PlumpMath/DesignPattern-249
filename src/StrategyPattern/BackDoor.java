package StrategyPattern;

public class BackDoor implements IStrategy
{

    @Override
    public void operation()
    {
        System.out.println("BackDoor");
    }

}
