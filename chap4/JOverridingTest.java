package chap4;

//例4.12
//JOverridingTest.java
class JOverriding
{
	public void test1()
	{
		System.out.println("Hi JOverriding");
	}
}

class JSubOverriding  extends  JOverriding
{
	//方法覆盖
	public void test1()
	{
		System.out.println("Hi JSubOverriding");
	}

	//方法重载
	public void test1(int i)
	{
		System.out.println("Hi JSubOverriding,Now i = " + i);
	}

	/**
	 * 既不是方法重载也不是覆盖，不被允许
	 * public String test1() { return "ok"; }
	 */
}

public class JOverridingTest
{
	public static void main(String args[])
	{
		JSubOverriding jSubOverriding=new JSubOverriding();
		JOverriding jOverriding=new JOverriding();
		jSubOverriding.test1();
		jSubOverriding.test1(100);
		jOverriding.test1();
	}
}
