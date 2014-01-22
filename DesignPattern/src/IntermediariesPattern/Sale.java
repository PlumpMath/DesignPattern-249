package IntermediariesPattern;

import java.util.Random;

public class Sale extends AbstarctColleage
{
    Sale(AbstarctMediator mediator)
    {
        super(mediator);
    }

    public void sellIBMComputer(int number)
    {
        super.mediator.execute("buy", number);
        System.out.println("卖出电脑" + number + "台");
    }

    public int getSaleStatus()
    {
        Random random = new Random();
        int count = random.nextInt(10);
        System.out.println("卖出:" + count);
        return count;
    }

    public void offSale()
    {
        super.mediator.execute("offsale");
    }

}
