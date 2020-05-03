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
        int hi = a;
        int mid = b;
        int low = c;
        if (a >= b && a >= c){
            hi = a;
            if (b > c){
                mid = b;
                low = c;
            }else {
                mid = c;
                low = b;
            }
        }
        if( b>= a && b >= c){
            hi = b;
            if (a > c){
                mid = a;
                low = c;
            }else {
                mid = c;
                low = a;
            }
        }
        if( c >= a && c >= b){
            hi = c;
            if(a > b){
                mid = a;
                low = b;
            }else{
                mid = b;
                low = a;
            }
        }

        return String.format("%s>%s>%s", hi, mid, low);
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
