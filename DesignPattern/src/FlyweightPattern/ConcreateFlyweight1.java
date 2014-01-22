package FlyweightPattern;

public class ConcreateFlyweight1 extends Flyweight
{

    public ConcreateFlyweight1(String extrinsic)
    {
        super(extrinsic);
    }

    @Override
    public void operate()
    {
System.out.println("ConcreateFlywight1");        
    }

}
