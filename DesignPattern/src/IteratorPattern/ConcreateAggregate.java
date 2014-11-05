package IteratorPattern;

import java.util.Vector;

public class ConcreateAggregate implements Aggregate {
    private Vector vector = new Vector();

    @Override
    public void add(Object obj) {
        this.vector.add(obj);
    }

    @Override
    public void remove(Object obj) {
        this.vector.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreateIterator(vector);
    }

}
