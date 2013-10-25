package ChainOfResponsibilityPattern;

public class Woman implements IWomen
{
    private int    type = 0;
    private String request;

    public Woman(int type, String request)
    {
        super();
        this.type = type;
        this.request = request;
    }

    public final int getType()
    {
        return type;
    }

    public final void setType(int type)
    {
        this.type = type;
    }

    public final String getRequest()
    {
        return request;
    }

    public final void setRequest(String request)
    {
        this.request = request;
    }

}
