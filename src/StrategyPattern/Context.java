package StrategyPattern;

public class Context
{
    private IStrategy strategy;

    public Context(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void operator()
    {
        this.strategy.operation();
    }
}
