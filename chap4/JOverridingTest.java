package chap4;

//��4.12
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
	//��������
	public void test1()
	{
		System.out.println("Hi JSubOverriding");
	}

	//��������
	public void test1(int i)
	{
		System.out.println("Hi JSubOverriding,Now i = " + i);
	}

	/**
	 * �Ȳ��Ƿ�������Ҳ���Ǹ��ǣ���������
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
