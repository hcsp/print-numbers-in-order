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
        String result = "";

        int[] params = {a, b, c};

        for (int i = 0; i < params.length - 1; i++) {
          for (int j = i + 1; j < params.length; j++) {
            if (params[j] < params[i]) {
              int temp = params[i];
              params[i] = params[j];
              params[j] = temp;
            }
          }
        }

        for (int k = params.length - 1; k >= 0; k--) {
            if (k != params.length - 1 && k != 0) {
                result += ">";
            }
            result += params[k];
            if (k != params.length - 1 && k != 0) {
                result += ">";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
