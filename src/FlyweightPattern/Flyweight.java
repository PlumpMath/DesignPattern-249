package FlyweightPattern;

public abstract class Flyweight
{
    private String intrinsic;
    protected final String extrinsic;
    
    public Flyweight(String extrinsic)
    {
        super();
        this.extrinsic = extrinsic;
    }
    
    public abstract void operate();

    public final String getIntrinsic()
    {
        return intrinsic;
    }

    public final void setIntrinsic(String intrinsic)
    {
        this.intrinsic = intrinsic;
    }
    
    
}
