package com.xuritian.exer;

import java.util.Scanner;
/*
 * Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
��ĸ�ͷ��Ӳ���ͬʱΪż��
��ĸ�ͷ��� ȡֵ��Χ��[1-20]
 */
public class huangjinfenge {
	
public static void main(String args []) {
	double zuixiaochazhi=1,a=1,a1=1;
	double j1 = 0,i1=0;
	for(double i=1;i<=20;i++) {
	for(double j=1;j<=i;j++) {
		if((i%2==0)&&(j%2==0)) {
			continue;
		}
		a =(double)(j/i);
			double bencichazhi=(double)Math.abs(a-0.618);
			System.out.println(a);
			System.out.println("���εĲ�ֵ��"+bencichazhi);
			System.out.println("��ֵ��Сֵ��"+zuixiaochazhi);
			System.out.println(j);
			System.out.println(i);
			System.out.println("******");
			if(bencichazhi<zuixiaochazhi) {
				zuixiaochazhi=bencichazhi;
				j1=j;
				i1=i;
				a1=a;
			}
	}
}int a11[]=new int[5];
	int b[]=new int[] {1,2,3};
			
	System.out.println(a11+" "+j1+" "+i1);
	System.out.println(a11.length);
	}
	


	}


