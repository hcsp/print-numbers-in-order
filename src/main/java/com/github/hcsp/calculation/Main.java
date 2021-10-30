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
        int max;
        int mid;
        int min;

        if (a > b && a > c) {
            max = a;
            if (b > c) {
                // a > b > c
                mid = b;
                min = c;
            } else {
                // a > c > b
                mid = c;
                min = b;
            }
        } else if (a < b && a < c) {
            min = a;
            if (b > c) {
                // b > c > a
                mid = c;
                max = b;
            } else {
                // c > b > a
                mid = b;
                max = c;
            }
        } else if (a > b && a < c) {
            // c > a > b
            max = c;
            mid = a;
            min = b;
        } else {
            // b > a > c
            max = b;
            mid = a;
            min = c;
        }

        return max + ">" + mid + ">" + min;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
