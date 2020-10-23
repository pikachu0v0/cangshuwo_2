package com.xuritian.exer;

public interface AD {
default public void attack() {
	System.out.println();
}


	public void physicAttack();
}

 class adhero extends hero implements AD,mortal{
	 public adhero() {
		 
	 }
	 public adhero(String heroName,float heroHP,float heroAromor,int heroMoveSpeed){
	super(heroName,heroHP,heroAromor,heroMoveSpeed);
	 }
	 public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	 public static void win() {
		 System.out.println("我草我们赢了");
	 }
	public void die(){
		System.out.println(this.name+",他是一个ad英雄");
	}
}
 
 interface mortal{
	 public void die();
	 
 }