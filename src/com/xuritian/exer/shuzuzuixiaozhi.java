package com.xuritian.exer;

/*
 * ���ȴ���һ��������5������
Ȼ��������ÿһλ�����������
ͨ��forѭ�����������飬�ҳ���С��һ��ֵ����

0-100�� ��������Ļ�ȡ�취�ж��֣������ǲο��취֮һ:
 
(int) (Math.random() * 100)

Math.random() ��õ�һ��0-1֮��������������Ȼ�����100����ǿתΪ���ͼ��ɡ�
 */
public class shuzuzuixiaozhi {
	public static void main(String args[]) {
		int a[] = new int[5];
		for (int i = 0; i <= 4; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.println(a[i]);
		} // for
		int min = 100, mini = 0;
		for (int i = 0; i <= 4; i++) {
			if (a[i] < min) {
				min = a[i];
				mini = i;
			}

		} // for
		System.out.println(min);
		System.out.println(mini);
	}
}
