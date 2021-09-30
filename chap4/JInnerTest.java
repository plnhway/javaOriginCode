package chap4;

//Àý4.25
//JInnerTest.java
class SuperA
{
	public String SayHello(String s)
	{
		return s + "  Hello";
	}
}

class SuperB
{
	public int calculation(int i)
	{
		return ++i;
	}
}

public class JInnerTest
{
	private class JInnerTest1 extends SuperA
	{

	}

	private class JInnerTest2 extends SuperB
	{
		public int calculation(int i)
		{
			return super.calculation(i);
		}
	}

	public String SayHello(String s)
	{
		return new JInnerTest1().SayHello(s);
	}

	public int calculation(int i)
	{
		return new JInnerTest2().calculation(i);
	}

	public static void main(String args[])
	{
		JInnerTest test = new JInnerTest();
		System.out.println(test.SayHello("ÕÅÈý"));
		System.out.println(test.calculation(100));
	}
}
