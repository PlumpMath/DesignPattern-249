package FactoryPattern;

public class YellowMan implements Human
{

    @Override
    public void getColor()
    {
        System.out.println("color:Yellow");
    }

    @Override
    public void talk()
    {
        System.out.println("im YellowMan");
    }

}
