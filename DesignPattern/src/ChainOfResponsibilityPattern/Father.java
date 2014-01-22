package ChainOfResponsibilityPattern;

public class Father extends Handler
{

    public Father()
    {
        super(Handler.FATHER_LEVEL);
    }

    @Override
    void response(IWomen women)
    {
        System.out.println("父亲");
        System.out.println("父亲已同意");
    }

}
