package com.xuritian.exer;

public class yingxionglianmeng {
	public static void main(String args[]) {
		weapon infinityedge = new weapon();
		infinityedge.damage = 80;
		infinityedge.name = "无尽之刃";
		infinityedge.price = 3600;

		armor suozijia = new armor();
		armor bujia = new armor();
		suozijia.name = "锁子甲";
		suozijia.price = 500;
		suozijia.ac = 40;
		bujia.name = "布甲";
		bujia.price = 150;
		bujia.ac = 15;

		hero gailun = new hero();
		gailun.name = "盖伦";
		gailun.hp = 600;

		hero timo = new hero();
		timo.hp = 500;
		timo.name = "提莫";
		
		support suona = new support();
		suona.name = "娑娜";
		suona.heal(50, gailun, timo);
		suona.heal();
		
		hero xuritian=new hero("许日天",9,99,999);
		System.out.println(xuritian.gethp());
		System.out.println(xuritian.getarmor());
		System.out.println(xuritian.getmovespeed());
		
		adhero chenyifan=new adhero("陈一帆",0.5f,0.5f,5);
		System.out.println(chenyifan.gethp());
		System.out.println(chenyifan.getarmor());
		System.out.println(chenyifan.getmovespeed());
		
		aphero chenchuang=new aphero("陈闯",0.5f,0.5f,5);
		 adhero ad = new adhero();
	        aphero ap = new aphero();
//	         
//	        hero h1= ad;
//	        hero h2= ap;
//	         
//	        //判断引用h1指向的对象，是否是ADHero类型
//	        System.out.println(h1 instanceof adhero);
//	         
//	        //判断引用h2指向的对象，是否是APHero类型
//	        System.out.println(h2 instanceof aphero);
//	         
//	        //判断引用h1指向的对象，是否是Hero的子类型
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
		System.out.println("英雄登场");
	}

//	  public hero(String heroName,float heroHP,float heroAromor,int heroMoveSpeed){
//	        this.name = heroName;
//	        this.hp = heroHP;
//	        this.armor = heroAromor;
//	        this.movespeed = heroMoveSpeed;
//	        System.out.println("英雄"+name+"登场");
//	    }//构造方法
	  
	  public hero(String name){
	        System.out.println("一个参数的构造方法");
	        this.name = name;
	    }
	  public hero(int a) {}
	      
	    //带两个参数的构造方法
	    public hero(String name,float hp){
	        this(name);
	        System.out.println("两个参数的构造方法");
	        this.hp = hp;
	    }
	    
	    public hero(String heroName,float heroHP,float heroAromor,int heroMoveSpeed){
	    	this(heroName,heroHP);
	        this.armor = heroAromor;
	        this.movespeed = heroMoveSpeed;
	        System.out.println("英雄"+name+"登场");
	    }//构造方法

	void keng() {
		System.out.println("坑队友！");
	}
	public static void win() {
		System.out.println("赢了");
	}

	public void kill(mortal m) {
		System.out.print(this.name+"杀死了");
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
		System.out.println("连杀八个！超神！");
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
		System.out.println("进行物理攻击");
	}
	public void magicAttack() {
		System.out.println("进行魔法攻击");
		
	}
	public void die() {
		System.out.println(this.name+"复杂的英雄被杀死");
	}
}

class support extends hero {
	public void heal() {
		System.out.println("不知道给谁加血了");
	}

	public void heal(float hp, hero h1) {
		h1.hp = h1.hp + hp;
		System.out.println(this.name + "对" + h1.name + "加了" + hp + "血");
		System.out.println(h1.name + "现在的hp是" + h1.gethp());
	}

	public void heal(float hp, hero... heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(heros[i].name + "现在的hp是" + heros[i].gethp());
			heros[i].hp = heros[i].hp + hp;
			System.out.println(this.name + "对" + heros[i].name + "加了" + hp + "血");
			System.out.println(heros[i].name + "现在的hp是" + heros[i].gethp());
		} // for

	}
}//support

class jiaxueyingxiong extends hero implements Healer{
	public void heal(){
		System.out.println("加血了哦");
	}
	
}
abstract class item {
	String name;
	int price;
	public void effect() {
		System.out.println("使用了物品");
	}
	public abstract boolean disposable() ;
	

}//item

class lanping extends item{
	public void effect() {
		System.out.println("回了蓝");
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
