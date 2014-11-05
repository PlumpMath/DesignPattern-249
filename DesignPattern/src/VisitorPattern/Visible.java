package VisitorPattern;

public class Visible implements IVisible
{

    @Override
    public void visit(ConcreateElement1 e)
    {
        e.adSomething();
    }

    @Override
    public void visit(ConcreateElement2 e)
    {
        e.adSomething();aaaa
    }

}
