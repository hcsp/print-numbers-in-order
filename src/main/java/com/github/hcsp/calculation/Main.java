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
        int n1 = Math.max(Math.max(a, b), c);
        int n3 = Math.min(Math.min(a, b), c);
        int n2 = 0;
        if ((n1 == b && n3 == c) || (n1 == c && n3 == b)) n2 = a;
        if ((n1 == a && n3 == c) || (n1 == c && n3 == a)) n2 = b;
        if ((n1 == a && n3 == b) || (n1 == b && n3 == a)) n2 = c;
        return n1 + ">" + n2 + ">" + n3;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
