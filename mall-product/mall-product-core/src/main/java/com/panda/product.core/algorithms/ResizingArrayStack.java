package com.panda.product.core.algorithms;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 2018/2/5
 * 定容栈的升级版：容量更加灵活，并且支持遍历
 *
 * @author: likaisheng
 */

public class ResizingArrayStack<Item> implements Iterable<Item>{

    private Item[] a;
    private int N;

    /**
     * 创建一个容量为cap的空栈
     *
     * @param cap
     */
    public ResizingArrayStack(int cap) {
        // 泛型数组在java中是不被允许的，我们需要类型转换
        a = (Item[]) new Object[cap];
    }

    /**
     * 删除最近添加的元素
     * 在删除元素时，如果栈大小小于数组的四分之一，将数组长度减半
     *
     * @return
     */
    public Item pop() {
        Item item = a[--N];
        a[N] = null; // 对象游离 方便垃圾回收
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    /**
     * 添加一个元素
     * 添加元素时，如果没有多余的空间，将数组的长度加倍
     *
     * @param item
     */
    public void push(Item item) {
        // 将元素压如栈顶
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    /**
     * 栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 栈中的元素数量
     *
     * @return
     */
    public int size() {
        return N;
    }

    /**
     * 将大小为 N < = max的栈移动到一个新的大小为max的数组中
     *
     * @param max
     */
    private void resize(int max) {
        Item[] tmp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            tmp[i] = a[i];
        }
        a = tmp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {

        // 支持先进后出的迭代
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            if(i == 0){
               throw new NoSuchElementException();
            }
            return a[--i];

        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
