package IteratorPattern;

import java.util.Vector;

public class ConcreateIterator implements Iterator {

    private Vector vector = null;

    private int cursor = 0;

    public ConcreateIterator(Vector vector) {
        super();
        this.vector = vector;
    }

    @Override
    public boolean heasNext() {
        if (this.cursor == this.vector.size())
            return false;

        return true;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.heasNext()) {
            obj = this.vector.get(this.cursor++);
        }

        return obj;
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }

}
