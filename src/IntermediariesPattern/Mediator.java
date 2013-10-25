package IntermediariesPattern;

public class Mediator extends AbstarctMediator
{

    @Override
    public void execute(String str, Object... objs)
    {
        if (str.equals("buy"))
        {
            System.out.println("买"+(Integer)objs[0]);
        } else if (str.equals("sell"))
        {
            System.out.println("卖"+(Integer)objs[0]);
        } else if (str.equals("offsell"))
        {
            System.out.println("倾"+(Integer)objs[0]);
        } else if (str.equals("clear"))
        {
            System.out.println("清"+(Integer)objs[0]);
        }

    }


}
