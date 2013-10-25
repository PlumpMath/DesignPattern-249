package IntermediariesPattern;

public abstract class AbstarctMediator
{
    Purchaser purchase;
    Sale      sale;
    Stock     stock;

    public AbstarctMediator()
    {
        purchase = new Purchaser(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objs);

}
