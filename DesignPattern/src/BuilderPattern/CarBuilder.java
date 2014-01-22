package BuilderPattern;

import java.util.ArrayList;

abstract class CarBuilder
{
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
