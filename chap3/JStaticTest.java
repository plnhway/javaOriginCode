package chap3;

//例3.14
//JStaticTest.java
public class JStaticTest
{
	String testName;

	public static void main(String args[])
	{
		JStaticTest s = new JStaticTest();
		s.testName = JPerson2.name; // 类变量的调用
		System.out.println("testName的值为 " + s.testName);
		s.testName = JPerson2.setName("李四"); // 类方法的调用
		System.out.println("JPerson2.name的值为 " + JPerson2.name);
		System.out.println("现在testName的值为  " + JPerson2.name);
	}
}
