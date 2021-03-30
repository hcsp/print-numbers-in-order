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
    int one, two, three;
    if (a > b && a > c) {
      one = a;
      if (b > c) {
        two = b;
        three = c;
      } else {
        two = c;
        three = b;
      }
    } else if (b > c && b > a) {
      one = b;
      if (c > a) {
        two = c;
        three = a;
      } else {
        two = a;
        three = c;
      }
    } else {
      one = c;
      if (a > b) {
        two = a;
        three = b;
      } else {
        two = b;
        three = a;
      }
    }
    return one + ">" + two + ">" + three;
  }

  public static void main(String[] args) {
    System.out.println(printNumbersInOrder(1, 2, 3));
    System.out.println(printNumbersInOrder(-1, 2, -3));
  }
}
