package AbstarctFactoryPattern;

class MaleFactory implements HumanFactory
{

    @Override
    public Human createYellowHuman()
    {
        return new MaleYellowMan();
    }

    @Override
    public Human createWhiteHuman()
    {
        return new MaleWhiteMan();
    }

    @Override
    public Human createBlackHuman()
    {
        return new MaleBlackMan();
    }

}
