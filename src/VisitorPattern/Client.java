package VisitorPattern;

public class Client
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            Element e = ObjectStruture.createElement();

            e.accpet(new Visible());
        }
    }
}
