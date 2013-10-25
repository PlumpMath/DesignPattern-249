package CommandPattern;

 class Invoker
{
        private Command command;


        public final void setCommand(Command command)
        {
            this.command = command;
        }
        
        public void addAction()
        {
            this.command.execute();
        }
}
