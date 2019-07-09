package com.panda.product.core.algorithms;

/**
 * 2018/2/5
 * 定容栈FixedCapacityStack
 * FixedCapacityStack 是 FixedCapacityStackOfStrings 的升级版 使用泛型，灵活的创建各种类型的栈
 * @author: likaisheng
 */

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    /**
     * 创建一个容量为cap的空栈
     * @param cap
     */
    public FixedCapacityStack(int cap){
        // 泛型数组在java中是不被允许的，我们需要类型转换
        a = (Item[]) new Object[cap];
    }

    /**
     * 栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return N == 0;
    }

    /**
     * 栈中的元素数量
     * @return
     */
    public int size(){
        return N;
    }
    /**
     * 添加一个元素
     * @param item
     */
    public void push(Item item){
        a[N++] = item;
    }

    /**
     * 删除最近添加的元素
     * @return
     */
    public Item pop(){
        return a[--N];
    }

    //    判断栈满的方法 未实现
    //    public boolean isFull(){
    //    }

}
