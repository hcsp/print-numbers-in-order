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
        int[] arr = new int[]{a, b, c};
        StringBuilder s = new StringBuilder();
        Arrays.sort(arr);
        //三个数字时使用下面这行语句
//        return arr[2]+">"+arr[1]+">"+arr[0];
        //数字个数不止三个时使用下面的for循环
        for (int i = arr.length - 1; i >= 0; i--) {
            //此处使用StringBuilder的append方法更方便，不推荐使用+进行字符串拼接，占用内存
            s.append(arr[i]);
            if (i != 0) {//可以用if进行特殊情况下的处理
                s.append(">");
            }
        }
        //使用StringBuilder之后，需要利用toString()方法转字符串
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
