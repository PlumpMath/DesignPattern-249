package FactoryPattern;

public class BlackMan implements Human
{

    @Override
    public void getColor()
    {
        System.out.println("color:black");
    }

    @Override
    public void talk()
    {
        System.out.println("im BlackMan");
    }

}
