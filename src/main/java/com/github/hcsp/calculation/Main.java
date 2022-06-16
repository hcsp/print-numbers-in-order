package com.github.hcsp.calculation;

import java.util.Arrays;
import java.util.Comparator;

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
        Integer[] arr = new Integer[]{a, b, c};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                }
                return 0;
            }
        });

        StringBuilder str = new StringBuilder();
        for (Integer ele: arr) {
            str.append(ele).append(">");
        }

        return str.substring(0, str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(129, 220, 123));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
