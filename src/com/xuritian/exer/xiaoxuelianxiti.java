package com.xuritian.exer;

public class xiaoxuelianxiti {
public static void main(String args[]) {
	for(int a=0;a<=8;a++) {
		for(int b=0;b<=8;b++) {
			if(a+b==8) {
				for(int c=0;c<=14;c++) {
					if(a+c==14)
					{
						for(int d=0;d<=10;d++)
						{
							if((b+d==10)&&(c-d==6))
								System.out.println(a+" "+b+" "+c+" "+d);
						}
					}
				}//forc
			}//if a+b
		}//forb
		
		
	}//fora
}
}
