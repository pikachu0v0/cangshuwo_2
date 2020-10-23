package com.xuritian.exer;

import java.util.Scanner;

public class tizhongceshi {
public static void main(String args[]) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("请输入宁德身高");
float shengao=s.nextFloat();
System.out.println("请输入宁德体重");
float tizhong=s.nextFloat();

float bmi=tizhong/(shengao*shengao);
System.out.println("当前的bmi是"+bmi);
System.out.print("身体状态是");
if (bmi<18.5)
	System.out.println("体重过轻");
	else if((bmi>=18.5)&&(bmi<24))
	System.out.println("正常范围");	
	else if((bmi>=24)&&(bmi<27))
		System.out.println("体重过重");	
	else if((bmi>=27)&&(bmi<30))
		System.out.println("轻度肥胖");	
	else if((bmi>=30)&&(bmi<35))
		System.out.println("中度肥胖");	
	else if((bmi>=35))
		System.out.println("重度肥胖");	
	
}
}
