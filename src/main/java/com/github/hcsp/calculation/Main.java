package com.github.hcsp.calculation;

import java.lang.reflect.Array;
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
        int ar[] = {a, b, c};
        for(int j=1;j<ar.length;j++){
            int k=ar[j];
            int i=j-1;
            while(i>=0){
                if(ar[i]<k){
                    ar[i+1]=ar[i];
                    ar[i]=k;
                }
                i--;
            }
        }
        return ar[0]+">"+ar[1]+">"+ar[2];
    }
       //  还是想着用插入排序试试-v-
       //  Arrays.sort(ar);
       //  return ar[2]+">"+ar[1]+">"+ar[0];

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
