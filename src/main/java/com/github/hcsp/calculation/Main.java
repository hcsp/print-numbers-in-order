package com.github.hcsp.calculation;

import java.util.Arrays;

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
//        String s;
//        if (a - b <= 0 && a - c <= 0) {
//            if (b - c <= 0) {
//                s = c + ">" + b + ">" + a;
//            } else {
//                s = b + ">" + c + ">" + a;
//            }
//        } else if (a >= b && a <= c) {
//            s = c + ">" + a + ">" + b;
//        } else if (a >= c && a <= b) {
//            s = b + ">" + a + ">" + c;
//        } else {
//            if (b - c >= 0) {
//                s = a + ">" + b + ">" + c;
//            } else {
//                s = a + ">" + c + ">" + b;
//            }
//        }
//        return s;
        int[] list = new int[]{a,b,c};
        Arrays.sort(list);
        String s=list[2]+">"+list[1]+">"+list[0];
        return s;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
