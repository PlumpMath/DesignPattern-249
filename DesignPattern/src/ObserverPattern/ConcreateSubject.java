package ObserverPattern;

public class ConcreateSubject extends Subject {
    public void doSomething() {
        super.notifyObservers();
    }
}
