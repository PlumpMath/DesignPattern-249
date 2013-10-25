package IntermediariesPattern;

public class Purchaser extends AbstarctColleage
{
    Purchaser(AbstarctMediator mediator)
    {
        super(mediator);
    }

    public void buyIBMComputer(int number)
    {
        super.mediator.execute("buy", number);
    }
    
    public void stopBuyIBM()
    {
        super.mediator.execute("stop");
    }
    
}
