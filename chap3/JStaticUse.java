package chap3;

//��3.16
//JStaticUse.java
public class JStaticUse
{
	static int a = 2;
	static int b;

	static
	{
		b = a * a;
		a = 3;
	}

	public static void main(String args[])
	{
		JStaticUse s1 = new JStaticUse();
		System.out.println("b��ֵΪ " + b);
		JStaticUse s2 = new JStaticUse();
		System.out.println("b��ֵ����Ϊ " + b);
	}
}
