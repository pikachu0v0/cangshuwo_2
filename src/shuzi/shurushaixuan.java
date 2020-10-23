package shuzi;
import java.util.Scanner;
public class shurushaixuan {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ÇëÊäÈëÄãµÄ×Ö·û´®");
	String str = s.nextLine();
	char[] cs = str.toCharArray(); 
	
for(int i=0;i<cs.length;i++) {
	if(Character.isUpperCase(cs[i])||(Character.isDigit(cs[i]))) {
		System.out.print(cs[i]);
	}
}//for


	

}//main
}
