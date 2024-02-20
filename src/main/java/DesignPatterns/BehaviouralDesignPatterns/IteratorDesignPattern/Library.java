package DesignPatterns.BehaviouralDesignPatterns.IteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class Library implements Aggregator {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator<Book> createIterator() {
        //return  bookList.iterator();
        return new BookIterator(bookList);
    }
}
