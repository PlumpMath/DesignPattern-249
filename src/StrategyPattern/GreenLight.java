package StrategyPattern;

public class GreenLight implements IStrategy
{

    @Override
    public void operation()
    {
        System.out.println("GreenLight");
    }

}
