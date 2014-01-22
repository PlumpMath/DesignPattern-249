package AdapterPattern;

public class Concreate implements Target
{

    @Override
    public void request()
    {
        System.out.println("call me");
    }

}
