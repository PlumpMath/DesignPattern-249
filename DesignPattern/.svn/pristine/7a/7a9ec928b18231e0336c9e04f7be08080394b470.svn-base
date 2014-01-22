package BuilderPattern;

import java.util.ArrayList;

abstract class CarModel
{
    private ArrayList<String> sequence = new ArrayList<String>();

    public final void setSequence(ArrayList<String> sequence)
    {
        this.sequence = sequence;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run()
    {
        String action = null;
        int size = sequence.size();
        for (int i = 0; i < size; i++)
        {

            action = sequence.get(i);
            if (action.equals("start"))
            {
                start();
            } else if (action.equals("stop"))
            {
                stop();
            } else if (action.equals("alarm"))
            {
                alarm();
            } else if (action.equals("engineBoom"))
            {
                engineBoom();
            }

        }

    }
}
