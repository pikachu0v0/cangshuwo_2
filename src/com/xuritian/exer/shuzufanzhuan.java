package com.xuritian.exer;
import java.util.Scanner;
/*
 * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)

使用for循环或者while循环，对这个数组实现反转效果
 */
public class shuzufanzhuan {
public static  void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int l=s.nextInt();
	int a[]=new int[l];
	for(int i=0;i<=l-1;i++)
	{
		a[i]=(int) (Math.random() * 100);
		System.out.println(a[i]);
		
	}
	int temp=0;
	for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	System.out.println("**********");
	for(int i=0;i<=l-1;i++) {
		System.out.println(a[i]);
	}
	
	
}
}
