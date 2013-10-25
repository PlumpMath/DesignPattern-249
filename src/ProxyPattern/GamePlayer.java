package ProxyPattern;

public class GamePlayer implements IGamePlayer
{
    private String name;
    @Override
    public void login(String user, String password)
    {
        this.name=user;
        System.out.println("name:"+this.name);
    }

    @Override
    public void killboss()
    {
        System.out.println(this.name+":kill boss");
    }

    @Override
    public void upgrade()
    {
        System.out.println(this.name+":upgrade");
    }

}
