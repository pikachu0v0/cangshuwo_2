package com.xuritian.exer;

public class yingxionglianmeng {
	public static void main(String args[]) {
		weapon infinityedge = new weapon();
		infinityedge.damage = 80;
		infinityedge.name = "�޾�֮��";
		infinityedge.price = 3600;

		armor suozijia = new armor();
		armor bujia = new armor();
		suozijia.name = "���Ӽ�";
		suozijia.price = 500;
		suozijia.ac = 40;
		bujia.name = "����";
		bujia.price = 150;
		bujia.ac = 15;

		hero gailun = new hero();
		gailun.name = "����";
		gailun.hp = 600;

		hero timo = new hero();
		timo.hp = 500;
		timo.name = "��Ī";
		
		support suona = new support();
		suona.name = "���";
		suona.heal(50, gailun, timo);
		suona.heal();
		
		hero xuritian=new hero("������",9,99,999);
		System.out.println(xuritian.gethp());
		System.out.println(xuritian.getarmor());
		System.out.println(xuritian.getmovespeed());
		
		adhero chenyifan=new adhero("��һ��",0.5f,0.5f,5);
		System.out.println(chenyifan.gethp());
		System.out.println(chenyifan.getarmor());
		System.out.println(chenyifan.getmovespeed());
		
		aphero chenchuang=new aphero("�´�",0.5f,0.5f,5);
		 adhero ad = new adhero();
	        aphero ap = new aphero();
//	         
//	        hero h1= ad;
//	        hero h2= ap;
//	         
//	        //�ж�����h1ָ��Ķ����Ƿ���ADHero����
//	        System.out.println(h1 instanceof adhero);
//	         
//	        //�ж�����h2ָ��Ķ����Ƿ���APHero����
//	        System.out.println(h2 instanceof aphero);
//	         
//	        //�ж�����h1ָ��Ķ����Ƿ���Hero��������
//	        System.out.println(h1 instanceof hero);
//	        lanping lan=new lanping();
//	        lan.effect();
//	        xuritian.kill(chenyifan);
//	        xuritian.kill(chenchuang);
	        hero hh=new adhero();
	        hh.win();
	}//main
}//class

class hero {
	String name;
	float hp;
	float armor;
	int movespeed;

	public hero() {
		System.out.println("Ӣ�۵ǳ�");
	}

//	  public hero(String heroName,float heroHP,float heroAromor,int heroMoveSpeed){
//	        this.name = heroName;
//	        this.hp = heroHP;
//	        this.armor = heroAromor;
//	        this.movespeed = heroMoveSpeed;
//	        System.out.println("Ӣ��"+name+"�ǳ�");
//	    }//���췽��
	  
	  public hero(String name){
	        System.out.println("һ�������Ĺ��췽��");
	        this.name = name;
	    }
	  public hero(int a) {}
	      
	    //�����������Ĺ��췽��
	    public hero(String name,float hp){
	        this(name);
	        System.out.println("���������Ĺ��췽��");
	        this.hp = hp;
	    }
	    
	    public hero(String heroName,float heroHP,float heroAromor,int heroMoveSpeed){
	    	this(heroName,heroHP);
	        this.armor = heroAromor;
	        this.movespeed = heroMoveSpeed;
	        System.out.println("Ӣ��"+name+"�ǳ�");
	    }//���췽��

	void keng() {
		System.out.println("�Ӷ��ѣ�");
	}
	public static void win() {
		System.out.println("Ӯ��");
	}

	public void kill(mortal m) {
		System.out.print(this.name+"ɱ����");
		m.die();
	}
	float getarmor() {
		return armor;
	}

	float gethp() {
		return hp;
	}

	void increasespeed(int movespeed) {
		this.movespeed = this.movespeed + movespeed;
	}

	void legendary() {
		System.out.println("��ɱ�˸�������");
	}

	float getmovespeed() {
		return movespeed;
	}

	void recovery(float blood) {
		hp = hp + blood;
	}

}// hero
class adaphero extends hero implements AD,AP,mortal{
	public adaphero(int a) {
		super(a);
	}
	public void physicAttack() {
		System.out.println("����������");
	}
	public void magicAttack() {
		System.out.println("����ħ������");
		
	}
	public void die() {
		System.out.println(this.name+"���ӵ�Ӣ�۱�ɱ��");
	}
}

class support extends hero {
	public void heal() {
		System.out.println("��֪����˭��Ѫ��");
	}

	public void heal(float hp, hero h1) {
		h1.hp = h1.hp + hp;
		System.out.println(this.name + "��" + h1.name + "����" + hp + "Ѫ");
		System.out.println(h1.name + "���ڵ�hp��" + h1.gethp());
	}

	public void heal(float hp, hero... heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(heros[i].name + "���ڵ�hp��" + heros[i].gethp());
			heros[i].hp = heros[i].hp + hp;
			System.out.println(this.name + "��" + heros[i].name + "����" + hp + "Ѫ");
			System.out.println(heros[i].name + "���ڵ�hp��" + heros[i].gethp());
		} // for

	}
}//support

class jiaxueyingxiong extends hero implements Healer{
	public void heal(){
		System.out.println("��Ѫ��Ŷ");
	}
	
}
abstract class item {
	String name;
	int price;
	public void effect() {
		System.out.println("ʹ������Ʒ");
	}
	public abstract boolean disposable() ;
	

}//item

class lanping extends item{
	public void effect() {
		System.out.println("������");
	}
	public boolean disposable(){
		return true;
	}

}
class weapon extends item {
	int damage;
	public boolean disposable() {
		return false;
	}
}//weapon

class armor extends item {
	int ac;

	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return false;
	}
}//armor
