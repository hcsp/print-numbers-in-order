package com.github.hcsp.calculation;

import java.lang.reflect.Array;

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

        String result=null;
        int[] nums = new int[] {a,b,c};
        bubbleSort(nums);

        for (int i=0;i<nums.length;i++) {
            if(i== 0){
                result =nums[i]+">";
            }else if(i!=(nums.length-1)){
                result += nums[i] + ">";
            }else{
                result += nums[i];
            }

        }

        return result;
    }
    public static void bubbleSort(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (nums[j - 1] < nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
