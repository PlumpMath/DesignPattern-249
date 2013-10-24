package BuilderPattern;

import java.util.ArrayList;

class BenzBuilder extends CarBuilder
{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence)
    {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel()
    {
        return benz;
    }

}
