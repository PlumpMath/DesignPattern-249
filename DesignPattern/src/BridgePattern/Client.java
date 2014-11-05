package BridgePattern;

public class Client {
    public static void main(String[] args) {
        Implementor imp = new ConcateateImplementor1();
        Abstraction abs = new RefinedAbstaction(imp);
        abs.request();

    }
}
