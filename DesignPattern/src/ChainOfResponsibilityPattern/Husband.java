package ChainOfResponsibilityPattern;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL);
    }

    @Override
    void response(IWomen women) {
        System.out.println("丈夫");
        System.out.println("丈夫已同意");
    }

}
