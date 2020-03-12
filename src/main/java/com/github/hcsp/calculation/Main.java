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

//        int x;
//        if (a < b) {
//            x = a;
//            a = b;
//            b = x;
//        }
//        if (a < c) {
//            x = a;
//            a = c;
//            c = x;
//        }
//        if (b < c) {
//            x = b;
//            b = c;
//            c = x;
//        }

        int[] y = {a, b, c};
        int t;
        for (int i = 0; i < y.length - 1; i++) {
            for (int j = 0; j < y.length - i - 1; j++) {
                if (y[j] < y[j + 1]) {
                    t = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = t;
                }
            }
        }
        return y[0] + ">" + y[1] + ">" + y[2];
//        return a + ">" + b + ">" + c;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
