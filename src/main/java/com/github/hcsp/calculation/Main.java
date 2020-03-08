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
    public static String printNumbersInOrder(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return numbersInOrder(a, b, c);
            } else {
                if (a >= c) {
                    return numbersInOrder(a, c, b);
                } else {
                    return numbersInOrder(c, a, b);
                }
            }
        } else {
            if (a >= c) {
                return numbersInOrder(b, a, c);
            } else {
                if (b >= c) {
                    return numbersInOrder(b, c, a);
                } else {
                    return numbersInOrder(c, b, a);
                }
            }
        }
    }

    private static String numbersInOrder(int max, int mid, int min) {
        return max + ">" + mid + ">" + min;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
