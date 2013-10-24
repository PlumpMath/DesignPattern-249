package FactoryPattern;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

class SingletonFactory
{
    private static SingletonFactory singletonFactory;

    public static SingletonFactory getInstance()
    {

        if (null == singletonFactory)
        {
            synchronized (SingletonFactory.class)
            {
                if (null == singletonFactory)
                {
                    try
                    {
                        Class c1 = Class.forName(SingletonFactory.class.getName());
                        Constructor constructor = c1.getDeclaredConstructor();
                        constructor.setAccessible(true);
                        singletonFactory = (SingletonFactory) constructor.newInstance();
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }

        return singletonFactory;
    }

    private static Map<String, Human> map = new HashMap<String, Human>();

    public static synchronized Human createProduct(String type)
    {
        Human human = null;
        if (map.containsKey(type))
        {
            human = map.get(type);
        } else
        {
            if (type.endsWith("WhiteMan"))
            {
                human = new HumanFactory().createHuman(WhiteMan.class);
            } else
            {
                human = new HumanFactory().createHuman(YellowMan.class);
            }

            if (null != human)
            {
                map.put(type, human);
            }
        }

        return human;

    }
}
