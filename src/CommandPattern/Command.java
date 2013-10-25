package CommandPattern;

public abstract class Command
{
    RequirementGroup rg=new RequirementGroup();
    
    PageGroup pg=new PageGroup();
    
    CodeGroup cd=new CodeGroup();
    
    
    public abstract void execute();
    
}
