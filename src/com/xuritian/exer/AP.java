package com.xuritian.exer;

public interface AP {
public void magicAttack();
}

class aphero extends hero implements AP,mortal {
	public aphero(){
		
	}
	public aphero(String heroName,float HP,float armor,int movespeed){
		super(heroName,HP,armor,movespeed);
	}
public void magicAttack() {
	System.out.println("进行魔法攻击");
}
	public void die() {
		System.out.println(this.name+"导致一个ap英雄被杀死");
	}
}	


interface Healer{
	public void heal();
}