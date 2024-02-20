package DesignPatterns.BehaviouralDesignPatterns.IteratorDesignPattern;

import java.util.Iterator;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
