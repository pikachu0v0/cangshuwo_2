package com.xuritian.exer;
/*
 * ˮ�ɻ������壺
1. һ����3λ��
2. ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3

Ѱ�����е�ˮ�ɻ���
 */
public class shuixianhuashu {
public static void main(String args[]) {
	for(int i=1;i<=999;i++) {
		int a=i/100;
		int b=i%100/10;
		int c=i%10;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(i);
//		System.out.println("********");
		if(i==(a*a*a+b*b*b+c*c*c))
			System.out.println(i);
	}
}
}
