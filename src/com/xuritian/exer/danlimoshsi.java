package com.xuritian.exer;

//public class danlimoshsi {
//	    //私有化构造方法使得该类无法在外部通过new 进行实例化
//	    private danlimoshsi(){
//	         
//	    }
//	    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
//	    private static danlimoshsi instance = new danlimoshsi();
//	    //public static 方法，提供给调用者获取12行定义的对象
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

