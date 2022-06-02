package com.github.hcsp.calculation;

public class Main {
    private static int max;

    private static String compare(int a, int b) {
        if (a > b) {
            return a + ">" + b;
        } else {
            return b + ">" + a;
        }
    }

    private static char setMax(int a, int b, int c) {
        char maxV;
        if (a > b) {
            max = a;
            maxV = 'a';
        } else {
            max = b;
            maxV = 'b';
        }
        if (max < c) {
            max = c;
            maxV = 'c';
        }
        return maxV;

    }

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
        char maxV = Main.setMax(a, b, c);
        String postfix = null;
        switch (maxV) {
            case 'a':
                postfix = compare(b, c);
                break;
            case 'b':
                postfix = compare(a, c);
                break;
            case 'c':
                postfix = compare(a, b);
                break;
        }
        return max + ">" + postfix;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
