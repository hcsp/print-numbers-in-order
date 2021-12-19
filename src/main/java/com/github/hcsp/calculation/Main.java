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
        int largest;
        int secondLargest;
        int thirdLargest;
        if (twoIntegerCompare(a, b)) {
            if (twoIntegerCompare(b, c)) {
                largest = a;
                secondLargest = b;
                thirdLargest = c;
            } else {
                thirdLargest = b;
                if (twoIntegerCompare(a, c)) {
                    largest = a;
                    secondLargest = c;
                } else {
                    largest = c;
                    secondLargest = a;
                }
            }
        } else {
            if (twoIntegerCompare(a, c)) {
                largest = b;
                secondLargest = a;
                thirdLargest = c;
            } else {
                thirdLargest = a;
                if (twoIntegerCompare(b, c)) {
                    largest = b;
                    secondLargest = c;
                } else {
                    largest = c;
                    secondLargest = b;
                }
            }
        }

        return largest + ">" + secondLargest + ">" + thirdLargest;
    }

    /**
     * 比较两个int值的大小
     * @param a int
     * @param b int
     * @return boolean
     */
    public static Boolean twoIntegerCompare (int a, int b) {
        return a > b;
    }
    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
