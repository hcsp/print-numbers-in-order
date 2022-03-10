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
        int Number1 = Math.max(Math.max(a, b), c);
        int Number3 = Math.min(Math.min(a, b), c);
        int Number2 = 0;
        if ((Number1 == b && Number3 == c) || (Number1 == c && Number3 == b)) Number2 = a;
        if ((Number1 == a && Number3 == c) || (Number1 == c && Number3 == a)) Number2 = b;
        if ((Number1 == a && Number3 == b) || (Number1 == b && Number3 == a)) Number2 = c;
        return Number1 + ">" + Number2 + ">" + Number3;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
