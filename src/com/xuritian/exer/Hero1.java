package com.xuritian.exer;

public class Hero1 {
    
    String name; //����
        
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
     
    public Hero1(){
         
    }
     
    //��Ѫ
    public void huixue(int xp){
        hp = hp + xp;
        //��Ѫ��Ϻ�Ѫƿ=0
        xp=0;
    }
      
    public Hero1(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    public static void main(String[] args) {
        Hero1 teemo =  new Hero1("��Ī",383);
        //Ѫƿ����ֵ��100
        int xueping = 100;
         
        //��Īͨ�����Ѫƿ��Ѫ
         
        teemo.huixue(xueping);
         
        System.out.println(xueping);
         
    }
      
}