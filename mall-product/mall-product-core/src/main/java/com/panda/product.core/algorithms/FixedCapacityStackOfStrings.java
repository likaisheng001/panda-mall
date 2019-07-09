package com.panda.product.core.algorithms;

/**
 * 2018/2/5
 * 栈的一种实现：定容栈
 * 数组中的元素顺序和它们被插入的顺序相同
 * 当N为0时栈为空
 * 栈的顶部位于a[N-1] 前提是栈非空
 * @author: likaisheng
 */

public class FixedCapacityStackOfStrings {
    private String[] a; // stack entries
    private int N;      // size

    /**
     * 创建一个容量为cap的空栈
     * @param cap
     */
    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    /**
     * 栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return N == 0;
    }

    /**
     * 栈中的字符串数量
     * @return
     */
    public int size(){
        return N;
    }

    /**
     * 删除最近添加的字符串
     * @return
     */
    public String pop(){
        return a[--N];
    }

    /**
     * 添加一个字符串
     * @param item
     */
    public void push(String item){
        a[N++] = item;
    }
//    判断栈满的方法 未实现
//    public boolean isFull(){
//    }
}
