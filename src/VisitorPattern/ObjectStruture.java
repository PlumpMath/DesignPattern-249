package VisitorPattern;

import java.util.Random;

public class ObjectStruture
{
    public static Element createElement()
    {
        Random rand = new Random();
        if (rand.nextBoolean())
        {
            return new ConcreateElement1();
        } else
        {
            return new ConcreateElement2();
        }

    }

}
