package com.xuritian.exer;

import java.util.Scanner;

public class tizhongceshi {
public static void main(String args[]) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("�������������");
float shengao=s.nextFloat();
System.out.println("��������������");
float tizhong=s.nextFloat();

float bmi=tizhong/(shengao*shengao);
System.out.println("��ǰ��bmi��"+bmi);
System.out.print("����״̬��");
if (bmi<18.5)
	System.out.println("���ع���");
	else if((bmi>=18.5)&&(bmi<24))
	System.out.println("������Χ");	
	else if((bmi>=24)&&(bmi<27))
		System.out.println("���ع���");	
	else if((bmi>=27)&&(bmi<30))
		System.out.println("��ȷ���");	
	else if((bmi>=30)&&(bmi<35))
		System.out.println("�жȷ���");	
	else if((bmi>=35))
		System.out.println("�ضȷ���");	
	
}
}
