package CommandPattern;

 class RequirementGroup extends Group
{
    @Override
    public void find()
    {
        System.out.println("find" + "Requirement");
    }

    @Override
    public void add()
    {
        System.out.println("add" + "Requirement");
    }

    @Override
    public void delete()
    {
        System.out.println("delete" + "Requirement");
    }

    @Override
    public void change()
    {
        System.out.println("change" + "Requirement");
    }

    @Override
    public void plan()
    {
        System.out.println("plan" + "Requirement");
    }

    @Override
    public void rollBack()
    {
        System.out.println("rollBack" + "Requirement");
        
    }
}
