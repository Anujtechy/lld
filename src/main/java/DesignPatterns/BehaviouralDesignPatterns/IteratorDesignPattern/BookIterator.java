package DesignPatterns.BehaviouralDesignPatterns.IteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class BookIterator<T> implements Iterator<T> {
    private List<T> books;
    private int index = 0;
    public BookIterator(List<T> bookList) {
        this.books = bookList;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public T next() {
        if(this.hasNext()){
            return books.get(index++);
        }
        return null;
    }
}
