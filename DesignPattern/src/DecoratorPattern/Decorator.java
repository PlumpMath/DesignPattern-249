package DecoratorPattern;

public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operate() {
        this.component.operate();
    }

}
