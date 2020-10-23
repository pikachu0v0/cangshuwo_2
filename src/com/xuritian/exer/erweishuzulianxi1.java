package com.xuritian.exer;

public class erweishuzulianxi1 {
	public static void main(String args[]) {
		int a[][] = new int[5][5];
		int max = 0;
		int ii = 0, jj = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = (int) (Math.random() * 100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		} // for

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					jj=j;
					ii=i;
				}//if
			}//for
		}//for
System.out.println("最大值是"+max+"是第"+(ii+1)+"行第"+(jj+1)+"列");
	}//main

}
