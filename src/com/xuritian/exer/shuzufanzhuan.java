package com.xuritian.exer;
import java.util.Scanner;
/*
 * ���ȴ���һ��������5������,������������ (���������������İ취���ο�����)

ʹ��forѭ������whileѭ�������������ʵ�ַ�תЧ��
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
