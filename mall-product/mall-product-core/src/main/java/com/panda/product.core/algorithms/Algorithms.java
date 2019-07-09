package com.panda.product.core.algorithms;

import java.util.Stack;

/**
 * 2018/1/25 算法库
 *
 * @author: likaisheng
 */
public class Algorithms {
    /**
     * 欧几里得算法
     *
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    /**
     * 二分查找算法
     *如果数组存在要查找的值，并且存在多个，该算法随机返回一个满足条件的下标
     * @param target 需要查找的数据
     * @param nums   有序数组
     * @return 如何找到，返回元素下标；如果找不到，返回-1
     */
    public static int binarySearch(int target, int[] nums) {
        // 数字必须是有序的
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {

            int mid = head + (tail - head)/2;
            int tmp = nums[mid];

            if(target == tmp){
                return mid;
            }else if(target > tmp){
                head = mid + 1;
            }else if(target < tmp){
                tail = mid - 1;
            }
        }
        return -1;
    }
    /**
     * 二分查找算法
     * 如果数组存在要查找的值，并且存在多个，该算法返回第一次出现的下标
     * @param target 需要查找的数据
     * @param nums   有序数组
     * @return 如何找到，返回元素下标；如果找不到，返回-1
     */
    public static int binarySearch2(int target, int[] nums) {
        // 数字必须是有序的
        int head = 0;
        int tail = nums.length - 1;
        int result = -1;

        while (head <= tail) {

            int mid = head + (tail - head)/2;
            int tmp = nums[mid];

            if(target == tmp){
                result = mid;
                tail = mid - 1;
            }else if(target > tmp){
                head = mid + 1;
            }else if(target < tmp){
                tail = mid - 1;
            }
        }
        return result;
    }

    /**
     * Dijkstra双栈算术表达式
     * @param str 要计算的算术表达式字符串 该算法目前只支持未省略括号的算术表达式
     * @return
     */
    public static double dijkstra(String str){
        // Prepare
        str = str.replace(" ",""); // 去掉表达式中的空格
        String[] arr = str.split(""); // 将表达式打散
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        // 读取字符串，如果是运算符则压入栈
        for (String s : arr) {
            if (s.equals("")) { // 略去字符数组的第一个空字符
                continue;
            }

            if (s.equals("(")) {

            } else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                // 如果字符为“）”，弹出运算符合操作数，计算结果并压入栈
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                // 如果字符既非运算符也不是括号，将它作为double值压入栈
                vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }
}
