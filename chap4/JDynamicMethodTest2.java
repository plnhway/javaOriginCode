package chap4;

//例4.16
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
		A2 a2 = new B2();  //向上转型
		System.out.println(a2.id);   //成员变量id并没有被覆盖，使用的还是A2类的id
		//System.out.println(a2.s);  //s是子类B2的变量，无法调用
		a2.Hello();  //子类覆盖了父类的Hello()方法，因此实际调用了B2的Hello()方法
		//a2.setId();  //setId()是子类B2的方法，无法调用
		System.out.println(a2.getId());
	}
}
