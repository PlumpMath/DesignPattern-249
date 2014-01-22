package BuilderPattern;

class Client
{
    public static void main(String[] args)
    {
        Director director = new Director();

        CarModel abenz = director.getABenzModel();
        abenz.run();

        CarModel bbenz = director.getBBenzModel();
        bbenz.run();

        CarModel abmw = director.getABMWModel();
        abmw.run();

        CarModel bbmw = director.getBBMWModel();
        bbmw.run();

    }
}
