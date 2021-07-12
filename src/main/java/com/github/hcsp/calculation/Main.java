package com.github.hcsp.calculation;

public class Main {
    /**
     * 给定三个大小不确定的数字a,b,c，将其按照从大到小的顺序输出。
     *
     * <p>例如，a=1,b=3,c=2，返回字符串"3>2>1"。
     *
     * <p>又如，a=-1,b=100,c=4，返回字符串"100>4>-1"
     *
     * @param a 数字一
     * @param b 数字二
     * @param c 数字三
     * @return 所要求的字符串
     */
    public static String getResultString(int a, int b, int c) {
        return a + ">" + b + ">" + c;
    }
    // 我感觉这道题在考察三目运算符但我没有证据
    // 所以前面那些用数组排序的功能没啥问题，但觉得有点怪
    public static String printNumbersInOrder(int a, int b, int c) {
//        abc acb bac bca cab cba
        if (a >= b && a >= c) {
            if (b >= c) {
                return getResultString(a, b, c);
            } else {
                return getResultString(a, c, b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                return getResultString(b, a, c);
            } else {
                return getResultString(b, c, a);
            }
        } else {
            if (a >= b) {
                return getResultString(c, a, b);
            } else {
                return getResultString(c, b, a);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
