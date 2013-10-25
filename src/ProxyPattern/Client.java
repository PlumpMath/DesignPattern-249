package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
        public static void main(String[] args)
        {
            IGamePlayer player=new GamePlayer();
            IGamePlayer proxy=new GamePlayerProxy(player);
            proxy.login("zhangsan", "11");
            proxy.killboss();
            proxy.upgrade();
            
            /**
             * 动态代理
             */
            InvocationHandler handler=new GamePlayIH(player);
            
            ClassLoader loader=player.getClass().getClassLoader();
            IGamePlayer proxy1=(IGamePlayer) Proxy.newProxyInstance(loader, new Class []{IGamePlayer.class}, handler);
            proxy1.login("lisi", "22");
            proxy1.killboss();
            proxy1.upgrade();
        }
}
