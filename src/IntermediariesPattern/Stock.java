package IntermediariesPattern;

public class Stock extends AbstarctColleage
{
    Stock(AbstarctMediator mediator)
    {
        super(mediator);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number)
    {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存增至:" + COMPUTER_NUMBER);
    }

    public void decrease(int number)
    {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存降至:" + COMPUTER_NUMBER);
    }

    public void getCount()
    {
        System.out.println("库存数:" + COMPUTER_NUMBER);
    }

    public void clearStock()
    {
        System.out.println("清理存货数量:" + COMPUTER_NUMBER);
        super.mediator.execute("clear");
    }

}
