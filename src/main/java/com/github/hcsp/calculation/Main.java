package com.github.hcsp.calculation;

import java.util.SplittableRandom;

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
        int min, max, med;//assume values are there for a b c

        if( a > b ){
            if( a > c ){
                max = a;
                if( b > c ){
                    med = b;
                    min = c;
                }else{
                    med = c;
                    min = b;
                }
            }else{
                med = a;
                max = c;
                min = b;
            }
        }else{
            if( b > c ){
                max = b;
                if( a > c ){
                    med = a;
                    min = c;
                }else{
                    med = c;
                    min = a;
                }
            }else{
                med = b;
                max = c;
                min = a;
            }
        }
        return String.valueOf(max)  + ">" + String.valueOf(med) + ">" + String.valueOf(min);
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
