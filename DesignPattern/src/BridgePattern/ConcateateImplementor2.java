package BridgePattern;

public class ConcateateImplementor2 implements Implementor {

    @Override
    public void doSomething() {
        System.out.println("ConcateateImplementor2" + "doSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcateateImplementor2" + "doAnything");
    }

}
