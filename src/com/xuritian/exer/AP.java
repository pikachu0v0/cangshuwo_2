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
	System.out.println("����ħ������");
}
	public void die() {
		System.out.println(this.name+"����һ��apӢ�۱�ɱ��");
	}
}	


interface Healer{
	public void heal();
}