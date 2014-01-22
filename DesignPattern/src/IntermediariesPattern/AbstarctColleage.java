package IntermediariesPattern;

public abstract class AbstarctColleage
{
    AbstarctMediator mediator;

    AbstarctColleage(AbstarctMediator mediator)
    {
        this.mediator = mediator;
    }
}
