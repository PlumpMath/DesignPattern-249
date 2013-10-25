package CommandPattern;

class Client
{
    public static void main(String[] args)
    {
        Invoker invoker = new Invoker();
        invoker.setCommand(new AddRequireCommand());
        invoker.addAction();
        invoker.setCommand(new DeletePageCommand());
        invoker.addAction();

    }
}
