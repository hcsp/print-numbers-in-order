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
        // a b c
        // a c b
        // b a c
        // b c a
        // c a b
        // c b a
        String result = null;
        if ((a > b) && (b > c)) {
            result = String.format("%d>%d>%d", a, b, c);
        } else if ((a > c) && (c > b)) {
            result = String.format("%d>%d>%d", a, c, b);
        } else if ((b > a) && (a > c)) {
            result = String.format("%d>%d>%d", b, a, c);
        } else if ((b > c) && (c > a)) {
            result = String.format("%d>%d>%d", b, c, a);
        } else if ((c > a) && (a > b)) {
            result = String.format("%d>%d>%d", c, a, b);
        } else if ((c > b) && (b > a)) {
            result = String.format("%d>%d>%d", c, b, a);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
