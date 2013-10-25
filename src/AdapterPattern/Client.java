package AdapterPattern;

public class Client
{
    public static void main(String[] args)
    {
        Target t = new Adapter();
        t.request();
        t = new Concreate();
        t.request();
    }
}
