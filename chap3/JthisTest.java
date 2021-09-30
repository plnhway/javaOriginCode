package chap3;

//例3.10
//JthisTest.java
public class JthisTest
{
	String a;
	char b;
	int c;

	public void setValue1(String aa, char bb, int cc)
	{
		this.a = aa; // 可以去除this关键字
		this.b = bb; // 可以去除this关键字
		this.c = cc; // 可以去除this关键字
	}

	public void setValue2(String a, char b, int c)
	{
		this.a = a; // 不能去除this关键字
		this.b = b; // 不能去除this关键字
		this.c = c; // 不能去除this关键字
	}

	public static void main(String args[])
	{
		JthisTest s = new JthisTest();
		s.setValue1("hello", 'X', 10);
		System.out.println("执行setValue1方法后的情况：a=" + s.a + " b=" + s.b + " c="
				+ s.c);
		s.setValue2("hi", 'Y', 100);
		System.out.println("执行setValue2方法后的情况：a=" + s.a + " b=" + s.b + " c="
				+ s.c);
	}
}
