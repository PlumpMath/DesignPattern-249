package VisitorPattern;

public class ConcreateElement2 extends Element {

    @Override
    public void adSomething() {

    }

    @Override
    public void accpet(IVisible visible) {
        System.out.println(visible + "e2");
    }

}
