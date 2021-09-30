package chap3;

//例3.17
//JFinalTest.java
public class JFinalTest
{
	final static int number = 100;//常量，不能改，必须赋值

	public void setValue(final int a, int b)
	{
		//a = b;
		b = 10;
	}

	public static void main(String args[])
	{
		// 下列语句去除注释后发生编译错误，final修饰的变量number无法再次赋值
		// JFinalTest.number=200;
		final JPerson2 s1 = new JPerson2(); // 实例化例3.13的JPerson2类
		JPerson2 s2 = new JPerson2();
		// 下列语句去除注释后发生编译错误，final修饰的变量s1无法再次赋值
		// s1=s2;
		s1.setValue(30, "美国");
		System.out.println("s1.age的值为" + s1.age + "  s1.counrty的值为"
				+ s1.country);
	}
}
