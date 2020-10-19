package com.github.hcsp.calculation;

import java.text.MessageFormat;

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
//        冒泡排序法
        int[] sorted = new int[]{a, b, c};
        int length = sorted.length - 1;
        while (length > 0) {
            for (int i = 0; i < length; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    switchTwoNumber(sorted, i, i + 1);
                }
            }
            length--;
        }
//        System.out.println(String.format("%d,,,,,%d,,,,%d",sorted[0],sorted[1],sorted[2]));
        return MessageFormat.format("{0}>{1}>{2}", sorted[0], sorted[1], sorted[2]);
    }

    private static void switchTwoNumber(int[] nums, int x, int y) {
        int temp = nums[y];
        nums[y] = nums[x];
        nums[x] = temp;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
