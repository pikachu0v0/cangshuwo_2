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
		System.out.println("����������");
	}
	 public static void win() {
		 System.out.println("�Ҳ�����Ӯ��");
	 }
	public void die(){
		System.out.println(this.name+",����һ��adӢ��");
	}
}
 
 interface mortal{
	 public void die();
	 
 }