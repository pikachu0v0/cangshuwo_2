package shuzi;
import java.util.Scanner;
public class suijizifu {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	char c[]=new char[s.nextInt()];
    	for(int a=0;a<c.length;a++) {
		int jiance=(int)(Math.random()*3+1);
		switch(jiance) {
		case 1:
			c[a]=(char)(Math.random()*(57-48+1)+48);
			break;
		case 2:
			c[a]=(char)(Math.random()*(90-65+1)+65);
			break;
		case 3:
			c[a]=(char)(Math.random()*(122-97+1)+97);
			break;
		}//switch	
		}//for
    	String str=String.valueOf(c);
//    	String s=c.toString();
    	System.out.println(str);
	}//main
}