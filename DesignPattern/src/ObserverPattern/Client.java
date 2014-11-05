package ObserverPattern;

public class Client {

    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();

        Observer observer = new ConcreateObserver();

        subject.addObserver(observer);

        subject.doSomething();
    }

}
