package StatePattern;

public abstract class State {
    Context context;

    public final Context getContext() {
        return context;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public abstract void handler();
}
