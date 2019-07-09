package com.panda.product.core.algorithms;

import java.util.Iterator;

/**
 * 2018/2/6
 * 使用链表实现的栈
 * @author: likaisheng
 */

public class Stack<Item> implements Iterable<Item>{

    private Node first; //栈顶（最近添加的元素）
    private int N; // 元素数量
    // 定义节点的嵌套类
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null; // 或：N == 0
    }

    public int size(){
        return N;
    }

    /**
     * 向栈顶添加元素
     * @param item
     */
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    /**
     * 从栈顶删除元素
     * @return
     */
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
