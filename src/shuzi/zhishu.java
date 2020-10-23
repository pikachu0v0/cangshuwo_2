package shuzi;

public class zhishu {
public static void main(String[] args) {
	int count=0;
	boolean flag=false;
	for(int i=1;i<10000000;i++) {
		flag=false;
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				flag=true;
				break;
			}//if
			
		}//for
		if(flag==true) 
			continue;
			//if
		System.out.println(i);
			count++;
	}//for
//	String ss="count%d";
	System.out.printf("count%d",count);
}//main
}
