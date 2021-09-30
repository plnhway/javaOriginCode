package chap4;

//��4.16
//JDynamicMethodTest2.java
class A2
{
	int id = 10;

	public void Hello()
	{
		System.out.println("Hello,here is A2");
	}
	
	public int getId()
	{
		return id;
	}
	
}

class B2 extends A2
{
	int id = 100;
	String s = "ok";

	public int getId()
	{
		return id;
	}
	
	public void Hello()
	{
		System.out.println("Hello,here is B2");
	}

	public void setId()
	{
		id = 1000;
	}
}

public class JDynamicMethodTest2
{
	public static void main(String args[])
	{
		A2 a2 = new B2();  //����ת��
		System.out.println(a2.id);   //��Ա����id��û�б����ǣ�ʹ�õĻ���A2���id
		//System.out.println(a2.s);  //s������B2�ı������޷�����
		a2.Hello();  //���า���˸����Hello()���������ʵ�ʵ�����B2��Hello()����
		//a2.setId();  //setId()������B2�ķ������޷�����
		System.out.println(a2.getId());
	}
}
