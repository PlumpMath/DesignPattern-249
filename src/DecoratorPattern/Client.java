package DecoratorPattern;

public class Client
{
    public static void main(String[] args)
    {
        Component c = new ConcreteComponent();

        c = new ConcreteDectorator1(c);
        c = new ConcreteDectorator2(c);
        c.operate();
    }
}
