package DecoratorPattern;

public class ConcreteDectorator2 extends Decorator {

    public ConcreteDectorator2(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("method2");
    }

    public void operate() {
        this.method1();
        super.operate();
    }

}
