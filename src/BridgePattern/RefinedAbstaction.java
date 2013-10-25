package BridgePattern;

public class RefinedAbstaction extends Abstraction
{

    public RefinedAbstaction(Implementor imp)
    {
        super(imp);
    }

    @Override
    public void request()
    {
        super.request();
        super.getImp().doAnything();
    }
    
    

}
