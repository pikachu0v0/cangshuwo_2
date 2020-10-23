package shuzi;

import java.util.Scanner;

public class zifuchuanpaixu {
	public static void main(String[] args) {
		String c[] = new String[8];
		char b[] = new char[5];
		for (int a = 0; a < 8; a++) {
			for (int cc = 0; cc < 5; cc++) {
				int jiance = (int) (Math.random() * 2 + 1);
				switch (jiance) {
				case 1:
					b[cc] = (char) (Math.random() * (90 - 65 + 1) + 65);
					break;
				case 2:
					b[cc] = (char) (Math.random() * (122 - 97 + 1) + 97);
					break;
				}// switch

			} // for
			String str = String.valueOf(b);
			c[a] = str;
			System.out.println(c[a]);
		} // for
		System.out.println("******************");
		for(int e=c.length;e>0;e--) {
		for(int d=0;d<e-1;d++) {
			if(Character.toUpperCase(c[d].charAt(0))>Character.toUpperCase(c[d+1].charAt(0))) {
				String temp=c[d];
				c[d]=c[d+1];
				c[d+1]=temp;
			}//if
			}//for;
		}//for
		for(int a=0;a<c.length;a++) {
			System.out.println(c[a]);
		}
	}// main
	}//class

