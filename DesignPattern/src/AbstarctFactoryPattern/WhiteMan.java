package AbstarctFactoryPattern;

abstract class WhiteMan implements Human
{

    @Override
    public void getColor()
    {
        System.out.println("color:White");
    }

    @Override
    public void talk()
    {
        System.out.println("im WhiteMan");
    }

}
