package com.xuritian.exer;
/*
 * ����׼���������飬�����ĳ�����5-10֮������������ʹ���������ʼ������������
(���������������İ취���ο�����)

Ȼ��׼�����������飬����������ĳ�����ǰ�����ĺ�
ͨ��System.arraycopy ��ǰ��������ϲ���������������
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

