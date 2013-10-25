package CommandPattern;

 class CodeGroup extends Group
{

    @Override
    public void find()
    {
        System.out.println("find" + "Code");
    }

    @Override
    public void add()
    {
        System.out.println("add" + "Code");
    }

    @Override
    public void delete()
    {
        System.out.println("delete" + "Code");
    }

    @Override
    public void change()
    {
        System.out.println("change" + "Code");
    }

    @Override
    public void plan()
    {
        System.out.println("plan" + "Code");
    }

    @Override
    public void rollBack()
    {
        System.out.println("rollBack" + "Code");
        
    }

}
