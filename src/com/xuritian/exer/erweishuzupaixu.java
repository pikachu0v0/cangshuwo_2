package com.xuritian.exer;

import java.util.Arrays;

/*
 * 首先定义一个5X8的二维数组，然后使用随机数填充满。
借助Arrays的方法对二维数组进行排序。
参考思路：
先把二维数组使用System.arraycopy进行数组复制到一个一维数组
然后使用sort进行排序
最后再复制回到二维数组。

 */
public class erweishuzupaixu {
	public static void main(String args[]) {
		int a[][] = new int[5][8];
		int b[] = new int[40];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
				System.out.print(a[i][j] + " ");
			} // for
			System.out.println();
		} // for
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
		} // for
		System.out.println("*************");
		Arrays.sort(b);
		int count = 0;
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
			count++;
		}
		System.out.println();
		System.out.println("*************");
			for(int i=0;i<a.length;i++){
			System.arraycopy(b, i*a[i].length, a[i], 0, a[i].length);
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				} // for
				System.out.println();
			} // for
//		for (int j = 0; j < b.length; j++) {
//			System.out.println(b[j]+" ");
//		} // for

	}
}
