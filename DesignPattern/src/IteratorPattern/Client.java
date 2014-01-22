package IteratorPattern;

public class Client
{
    public static void main(String[] args)
    {
        Aggregate agg = new ConcreateAggregate();
        agg.add(1);
        agg.add(2);

        Iterator iterator = agg.iterator();
        while (iterator.heasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
