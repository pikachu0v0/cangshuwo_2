package com.xuritian.exer;

import java.util.Arrays;

/*
 * ���ȶ���һ��5X8�Ķ�ά���飬Ȼ��ʹ��������������
����Arrays�ķ����Զ�ά�����������
�ο�˼·��
�ȰѶ�ά����ʹ��System.arraycopy�������鸴�Ƶ�һ��һά����
Ȼ��ʹ��sort��������
����ٸ��ƻص���ά���顣

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
