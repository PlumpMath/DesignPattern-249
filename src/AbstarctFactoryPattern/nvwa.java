package AbstarctFactoryPattern;

/**
 * 抽象工厂方法模式
 * 
 * @author V
 * 
 */
class nvwa
{
    public static void main(String[] args)
    {
        HumanFactory manFactory = new MaleFactory();
        HumanFactory womanFactory = new FemaleFactory();

        Human yellowMan = manFactory.createYellowHuman();
        yellowMan.getSex();
        yellowMan.getColor();
        yellowMan.talk();
        Human blackwoman = womanFactory.createBlackHuman();
        blackwoman.getSex();
        blackwoman.getColor();
        blackwoman.talk();

    }
}
