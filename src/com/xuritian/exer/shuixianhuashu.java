package com.xuritian.exer;
/*
 * 水仙花数定义：
1. 一定是3位数
2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3

寻找所有的水仙花数
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
