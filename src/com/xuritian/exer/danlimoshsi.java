package com.xuritian.exer;

//public class danlimoshsi {
//	    //˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
//	    private danlimoshsi(){
//	         
//	    }
//	    //׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
//	    private static danlimoshsi instance = new danlimoshsi();
//	    //public static �������ṩ�������߻�ȡ12�ж���Ķ���
//	    public static danlimoshsi getInstance(){
//	        return instance;
//	    }
//	     
//	}

public class danlimoshsi{
	private danlimoshsi() {
		
	}
	
	private static danlimoshsi s=new danlimoshsi();
	
	public static danlimoshsi getdanlimoshi() {
		return s;
		
	}
	
	
	
	
}

