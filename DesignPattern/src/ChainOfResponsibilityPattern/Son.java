package ChainOfResponsibilityPattern;

public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL);
    }

    @Override
    void response(IWomen women) {
        System.out.println("儿子");
        System.out.println("儿子已同意");
    }

}
