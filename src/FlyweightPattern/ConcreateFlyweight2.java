package FlyweightPattern;

public class ConcreateFlyweight2 extends Flyweight
{

    public ConcreateFlyweight2(String extrinsic)
    {
        super(extrinsic);
    }

    @Override
    public void operate()
    {
System.out.println("ConcreateFlyweight2");        
    }

}
