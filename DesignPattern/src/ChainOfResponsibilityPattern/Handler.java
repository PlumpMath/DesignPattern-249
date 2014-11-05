package ChainOfResponsibilityPattern;

public abstract class Handler {
    public final static int FATHER_LEVEL = 1;
    public final static int HUSBAND_LEVEL = 2;
    public final static int SON_LEVEL = 3;

    public Handler nextHandler;

    private int level = 0;

    public Handler(int level) {
        this.level = level;
    }

    public void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            } else {
                System.out.println("无人");
            }
        }
    }

    public final Handler getNextHandler() {
        return nextHandler;
    }

    public final void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void response(IWomen women);
}
