package com.xuritian.exer;


//package charactor;

//public class GiantDragon {
//  
//    //˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
//    private GiantDragon(){       
//    }
//  
//    //׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
//    private static GiantDragon instance;
//      
//    //public static ����������ʵ������
//    public static GiantDragon getInstance(){
//        //��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
//        if(null==instance){
//            instance = new GiantDragon();
//        }
//        //���� instanceָ��Ķ���
//        return instance;
//    }
//      
//}
//****************************
//public class lanhanshi {
//
//	private lanhanshi() {
//	}
//	
//		private static lanhanshi s=null;
//		
//	
//	
//	public static lanhanshi gets() {
//		if(s==null)
//		{
//			s=new lanhanshi();
//		}
//		return s;
//	}
//}
public class lanhanshi{
	private lanhanshi() {
		
	}
	
	private static lanhanshi s=null;
	public static lanhanshi gets() {
		if(s==null) {
			s=new lanhanshi();
		}
		return s;
		
	} 
	
	
	
	
}
