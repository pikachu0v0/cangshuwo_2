package shuzi;

public class char1 {
public static void main(String[] args) {
	System.out.println(Character.isLetter('a'));//�ж��Ƿ�Ϊ��ĸ
    System.out.println(Character.isDigit('a')); //�ж��Ƿ�Ϊ����
    System.out.println(Character.isWhitespace(' ')); //�Ƿ��ǿհ�
    System.out.println(Character.isUpperCase('a')); //�Ƿ��Ǵ�д
    System.out.println(Character.isLowerCase('a')); //�Ƿ���Сд
     
    System.out.println(Character.toUpperCase('a')); //ת��Ϊ��д
    System.out.println(Character.toLowerCase('A')); //ת��ΪСд

//    String a = 'a'; //���ܹ�ֱ�Ӱ�һ���ַ�ת�����ַ���
    String a2 = Character.toString('a'); //ת��Ϊ�ַ���
}
}
