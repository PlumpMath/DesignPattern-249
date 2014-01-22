package ProxyPattern;

public class GamePlayerProxy implements IGamePlayer, IProxy
{
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer)
    {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password)
    {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killboss()
    {
        this.gamePlayer.killboss();
    }

    @Override
    public void upgrade()
    {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count()
    {
        System.out.println(" 500 $");
    }

}
