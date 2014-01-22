package DecoratorPattern;

public class ConcreteDectorator1 extends Decorator
{

    public ConcreteDectorator1(Component component)
    {
        super(component);
    }

    private void method1()
    {
        System.out.println("method1");
    }

    public void operate()
    {
        this.method1();
        super.operate();
    }

}
