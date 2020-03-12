package com.github.hcsp.calculation;

import java.lang.reflect.Array;

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
        int[] list = {a, b, c};
        for (int i = list.length - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j+1 <= i; j++) {
                if (list[j] < list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) break;
        }
        return list[0] + ">" + list[1] + ">" + list[2];
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
