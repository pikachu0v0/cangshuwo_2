package com.xuritian.exer;
import java.util.Scanner;
/*���ȴ���һ��������5������,������������ (���������������İ취���ο�����)

������ѡ��������Ȼ���ٶ���ʹ��ð�ݷ�������

ע ��ν����������Ǵ�С�������򣬵�������ǴӴ�С����
*/
public class suijibingqiepaixu {
public static void main(String args[]) {
	Scanner s=new  Scanner(System.in);
	System.out.println("������������鳤��");
	int l=s.nextInt();//����������鳤��
	int a[]=new int[l];
	for(int i=0;i<=l-1;i++) {
		a[i]=(int)(Math.random()*100);
		System.out.println(a[i]);
	}//for��������и�ֵ ��ӡ
	for(int i=0;i<a.length;i++) {
	for(int j=i;j<a.length;j++) {
	if(a[j]<a[i]) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;	
	}//if���������ѡ������
	}
	}//for
	System.out.println("****����ѡ������****");
	for(int i=0;i<=l-1;i++) {
		System.out.println(a[i]);
	}//for��������������д�ӡ
	//ð������ʼ
	for(int i=0;i<l;i++) {
		for(int j=0;j<l-1-i;j++) {
			if(a[j]<a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}//if	
		}//for
	}//for

	System.out.println("****����ð������****");
	for(int i=0;i<=l-1;i++) {
		System.out.println(a[i]);
	}//for��������������д�ӡ
	}//main

}//public

