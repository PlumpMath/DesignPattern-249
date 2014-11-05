package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    public void addObserver(Observer obj) {
        list.add(obj);
    }

    public void delObserver(Observer obj) {
        list.remove(obj);
    }

    public void notifyObservers() {
        for (Observer o : this.list) {
            o.update();
        }
    }

}
