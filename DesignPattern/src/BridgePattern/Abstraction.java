package BridgePattern;

public abstract class Abstraction {
    private Implementor imp;

    public Abstraction(Implementor imp) {
        super();
        this.imp = imp;
    }

    public void request() {
        this.imp.doAnything();
    }

    public final Implementor getImp() {
        return imp;
    }

    public final void setImp(Implementor imp) {
        this.imp = imp;
    }


}
