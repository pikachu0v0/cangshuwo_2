package com.xuritian.exer;

/*
 * 首先创建一个长度是5的数组
然后给数组的每一位赋予随机整数
通过for循环，遍历数组，找出最小的一个值出来

0-100的 随机整数的获取办法有多种，下面是参考办法之一:
 
(int) (Math.random() * 100)

Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。
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
