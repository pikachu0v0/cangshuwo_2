package com.xuritian.exer;
/*
 * 首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
(向数组填充随机数的办法，参考这里)

然后准备第三个数组，第三个数组的长度是前两个的和
通过System.arraycopy 把前两个数组合并到第三个数组中
 */
public class lianxihebingshuzu {
public static void main(String args []) {
	int a=(int)(Math.random()*(10+1-5)+5);
	int b=(int)(Math.random()*(10+1-5)+5);
	int c=a+b;
	int aa[]=new int[a];
	int bb[]=new int[b];
	int cc[]=new int[c];
	for(int i=0;i<a;i++) {
		aa[i]=(int)(Math.random()*(100));
		System.out.println(aa[i]);
	}//for
	System.out.println("************");
	for(int i=0;i<b;i++) {
		bb[i]=(int)(Math.random()*(100));
		System.out.println(bb[i]);
	}//for
	System.out.println("************");
	System.arraycopy(aa,0,cc,0,a);
	System.arraycopy(bb, 0, cc, a, b);
	for(int i=0;i<c;i++) {
		System.out.println(cc[i]);
	}//for
	}
}

