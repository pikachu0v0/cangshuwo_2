package shuzi;

public class qiongjifamima {
	public static void main(String args[]) {
		char cc[] = new char[3];
		char cd[] = new char[3];
		cc = shengchengshuzu();
		String str = String.valueOf(cc);
		System.out.println(str);
		jian(cc,3);
	}

	public static char[] shengchengshuzu() {
		char c[] = new char[3];
		for (int a = 0; a < c.length; a++) {
			int jiance = (int) (Math.random() * 3 + 1);
			switch (jiance) {
			case 1:
				c[a] = (char) (Math.random() * (57 - 48 + 1) + 48);
				break;
			case 2:
				c[a] = (char) (Math.random() * (90 - 65 + 1) + 65);
				break;
			case 3:
				c[a] = (char) (Math.random() * (122 - 97 + 1) + 97);
				break;
			}// switch
		} // for
		return c;
	}// class

	public static char shengcheng() {
		char c = 0;
		int jiance = (int) (Math.random() * 3 + 1);
		switch (jiance) {
		case 1:
			c = (char) (Math.random() * (57 - 48 + 1) + 48);
			break;
		case 2:
			c = (char) (Math.random() * (90 - 65 + 1) + 65);
			break;
		case 3:
			c = (char) (Math.random() * (122 - 97 + 1) + 97);
			break;
		}// switch
		return c;
	}

	public static void jian(char c[], int shu) {
		if (shu == 1) {
			while (shengcheng() != c[shu-1]) {
			} // while
			System.out.println(c[shu-1]);
			return;
		} 
		else{
			jian(c, shu - 1);
			while (shengcheng() != c[shu-1]) {
			} // while
			System.out.println(c[shu-1]);
			return;
		}// if
	}// class
}// public class
