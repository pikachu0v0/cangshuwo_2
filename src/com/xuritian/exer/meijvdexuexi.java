package com.xuritian.exer;
import java.util.Scanner;
/*
 * Ӣ������������ôһЩ����
TANK (̹��)
WIZARD (��ʦ )
ASSASSIN (�̿�)
ASSIST (����)
WARRIOR (��ս)
RANGED (Զ�� )
PUSH (�ƽ�)
FARMING (��Ұ)
���һ��ö������HeroType,ʹ������������Ϊ����

�ٱ�дһ��switch��䣬��ÿ��ö�ٳ������Ϊ�����ַ���
 */
public class meijvdexuexi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b=s.nextLine();
		switch (HeroType.valueOf(b)) {
		case TANK:
			System.out.println("̹��");
			break;
		case WIZARD:
			System.out.println("��ʦ");
			break;
		case ASSASSIN:
			System.out.println("�̿�");
			break;
		case ASSIST:
			System.out.println("����");
			break;
		case WARRIOR:
			System.out.println("��ս");
			break;
		case RANGED:
			System.out.println("Զ��");
			break;
		case PUSH:
			System.out.println("�ƽ�");
			break;
		case FARMING:
			System.out.println("��Ұ");
			break;
		default:
			System.out.println("Nothing!");
		}
//		for (HeroType a : HeroType.values()) {
//            System.out.println(a);
//        
//		switch (a) {
//		case TANK:
//			System.out.println("̹��");
//			break;
//		case WIZARD:
//			System.out.println("��ʦ");
//			break;
//		case ASSASSIN:
//			System.out.println("�̿�");
//			break;
//		case ASSIST:
//			System.out.println("����");
//			break;
//		case WARRIOR:
//			System.out.println("��ս");
//			break;
//		case RANGED:
//			System.out.println("Զ��");
//			break;
//		case PUSH:
//			System.out.println("�ƽ�");
//			break;
//		case FARMING:
//			System.out.println("��Ұ");
//			break;
//		default:
//			System.out.println("Nothing!");
//		}
//		}
	}
}

enum HeroType {
	TANK, WIZARD, ASSASSIN, ASSIST, WARRIOR, RANGED, PUSH, FARMING
}