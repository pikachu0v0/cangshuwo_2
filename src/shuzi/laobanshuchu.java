package shuzi;
import java.util.Scanner;
public class laobanshuchu {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("请输入地名");
String diming=s.nextLine();
System.out.println("请输入公司类型");
String leixing=s.nextLine();
System.out.println("请输入公司名称");
String gongsimingcheng=s.nextLine();
System.out.println("请输入老板名称");
String laobanmingcheng=s.nextLine();
System.out.println("请输入金额");
String jine=s.nextLine();
System.out.println("请输入产品");
String chanpin=s.nextLine();
System.out.println("请输入价格计量单位");
String danwei=s.nextLine();
System.out.printf("%s最大%s %s倒闭了，"
		+ "王八蛋老板%s吃喝嫖赌，欠下了%s，带%n"
		+ "着他的小姨子跑了!我们没有办法，拿着%s抵工%n"
		+ "资!原价都是一%s多、两%s多、三%s多的%s，现%n"
		+ "在全部只卖二十块，统统只要二十块!%s王八蛋%n"
		+ "，你不是人!我们辛辛苦苦给你干了大半年，你不%n"
		+ "发工资，你还我血汗钱，还我血汗钱!",diming,leixing
		,gongsimingcheng,laobanmingcheng,jine,chanpin,danwei
		,danwei,danwei,chanpin,laobanmingcheng);
	}//main

}
