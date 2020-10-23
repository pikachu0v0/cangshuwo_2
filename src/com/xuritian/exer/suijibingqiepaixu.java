package com.xuritian.exer;
import java.util.Scanner;
/*首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)

首先用选择法正排序，然后再对其使用冒泡法倒排序

注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
*/
public class suijibingqiepaixu {
public static void main(String args[]) {
	Scanner s=new  Scanner(System.in);
	System.out.println("请输入随机数组长度");
	int l=s.nextInt();//输入随机数组长度
	int a[]=new int[l];
	for(int i=0;i<=l-1;i++) {
		a[i]=(int)(Math.random()*100);
		System.out.println(a[i]);
	}//for对数组进行赋值 打印
	for(int i=0;i<a.length;i++) {
	for(int j=i;j<a.length;j++) {
	if(a[j]<a[i]) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;	
	}//if对数组进行选择排序
	}
	}//for
	System.out.println("****进行选择排序****");
	for(int i=0;i<=l-1;i++) {
		System.out.println(a[i]);
	}//for对排序后的数组进行打印
	//冒泡排序开始
	for(int i=0;i<l;i++) {
		for(int j=0;j<l-1-i;j++) {
			if(a[j]<a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}//if	
		}//for
	}//for

	System.out.println("****进行冒泡排序****");
	for(int i=0;i<=l-1;i++) {
		System.out.println(a[i]);
	}//for对排序后的数组进行打印
	}//main

}//public

