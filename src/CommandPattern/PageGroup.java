package CommandPattern;

class PageGroup extends Group
{
    @Override
    public void find()
    {
        System.out.println("find" + "Page");
    }

    @Override
    public void add()
    {
        System.out.println("add" + "Page");
    }

    @Override
    public void delete()
    {
        System.out.println("delete" + "Page");
    }

    @Override
    public void change()
    {
        System.out.println("change" + "Page");
    }

    @Override
    public void plan()
    {
        System.out.println("plan" + "Page");
    }

    @Override
    public void rollBack()
    {
        System.out.println("rollBack" + "Page");
    }
}
