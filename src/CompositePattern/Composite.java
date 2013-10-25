package CompositePattern;

import java.util.ArrayList;

public class Composite extends Component
{
    private ArrayList<Component> list = new ArrayList<Component>();

    public void add(Component component)
    {
        this.list.add(component);
    }

    public void remove(Component component)
    {
        this.list.remove(component);
    }

    public ArrayList<Component> getList()
    {
        return this.list;
    }

}
