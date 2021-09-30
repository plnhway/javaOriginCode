package chap4;

import chap4.JOut.JInner1;
import chap4.JOut.JInner2;

//Àý4.22
//JOutTest.java
class JOut
{
	static class JInner1
	{
		final static String InnerClassName = "JInner1";

		double calculate(double i)
		{
			return i * i;
		}
	}

	class JInner2
	{
		static final String InnerClassName = "JInner2";

		double calculate(double i, double j)
		{
			return i * j;
		}
	}
}

public class JOutTest
{

	public static void main(String args[])
	{
		JInner1 i1 = new JOut.JInner1();
		JOut o = new JOut();
		JInner2 i2 = o.new JInner2();
		JInner2 i3 = new JOut().new JInner2();
		System.out.println(JOut.JInner1.InnerClassName);
		System.out.println(i1.calculate(10.0));
		System.out.println(JOut.JInner2.InnerClassName);
		System.out.println(i2.calculate(10.0, 20.0));
	}
}
