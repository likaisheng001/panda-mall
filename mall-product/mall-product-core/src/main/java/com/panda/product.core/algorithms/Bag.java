package com.panda.product.core.algorithms;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * 2018/2/1
 * 使用java实现bag
 * @author: likaisheng
 */
public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;   // beginning of bag
    private int n;  // number of elements in bag

    // Helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    // Initializes an empty bag
    public Bag() {
        first = null;
        n = 0;
    }

    /*
     * Returns true if this bag is empty
     * @return {@code true} if this bag is empty
     *          {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this bag
     *
     * @return the number of items in this bag
     */
    public int size() {
        return n;
    }

    /*
     * Adds the item to this bag
     * @param item the item to add to this bag
     */
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /*
     * Returns an iterator that iterates over the items in this bag in arbitrary order
     * @return an iterator that iterates over the items in this bag in arbitrary order
     */
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    // An iterator,doesn't implements removef() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {

            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;

        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Unit tests the {@code Bag} data type
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        for (int i = 0; i < 10; i++) {
            bag.add(i + "---> item");
        }
        System.out.println("size of bag = " + bag.size());
        for(String s : bag){
            System.out.println("show ---->" + s);
        }
    }
}
