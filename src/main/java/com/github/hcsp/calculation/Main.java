package com.github.hcsp.calculation;

import java.lang.reflect.Array;
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
        // if (a > b && a > c) {
        //     if (b > c) {
        //         return a + ">" + b + ">" + c;
        //     }
        //     return a + ">" + c + ">" + b;
        // } else if (b > a && b > c) {
        //     if (a > c) {
        //         return b + ">" + a + ">" + c;
        //     }
        //     return b + ">" + c + ">" + b;
        // } else if (c > a && c > b) {
        //     if (a > b) {
        //         return c + ">" + a + ">" + b;
        //     }
        //     return c + ">" + a + ">" + a;
        // }
        // return a + ">" + b + ">" + c;
        int[] arr = new int[]{a, b, c};
        String result = "";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ">";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
