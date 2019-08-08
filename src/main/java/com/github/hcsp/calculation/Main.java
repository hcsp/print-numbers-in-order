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
		int max, middle, min;
		if (a > b) {
			if (b > c) {
				max = a;
				middle = b;
				min = c;
			} else {
				if (a > c) {
					max = a;
					middle = c;
					min = b;
				} else {
					max = c;
					middle = a;
					min = b;
				}
			}
		} else {
			if (a > c) {
				max = b;
				middle = a;
				min = c;
			} else {
				if (b > c) {
					max = b;
					middle = c;
					min = a;
				} else {
					max = c;
					middle = b;
					min = a;
				}
			}
		}

		return max + ">" + middle + ">" + min;
	}

	public static void main(String[] args) {
		System.out.println(printNumbersInOrder(1, 2, 3));
		System.out.println(printNumbersInOrder(-1, 2, -3));
	}
}
