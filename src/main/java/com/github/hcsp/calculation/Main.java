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
        int d,m,max=a;
       int [] i=new int[3];
       int [] j=new int[3];
       i[0]=a;i[1]=b;i[2]=c;
       for (m=0;m<=2;m++){
            for (d=0;d<2-m;d++){
               if(i[d]<i[d+1]){
                  max=i[d];
                  i[d]=i[d+1];
                  i[d+1]=max;
               }
            }

        }
       return String.valueOf(i[0])+">"+String.valueOf(i[1])+">"+String.valueOf(i[2]);
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
