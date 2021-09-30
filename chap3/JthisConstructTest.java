package chap3;

//例3.11
//JthisConstructTest.java
public class JthisConstructTest
{
	String name;
	int age;

	public JthisConstructTest()
	{
		name = "张三";
		age = 20;

	}

	public JthisConstructTest(String name, int age)
	{
		this(); //通过this调用无参构造方法
		System.out.println("name=" + this.name + "  age=" + this.age);
	}

	public static void main(String args[])
	{	
		JthisConstructTest test=new JthisConstructTest("李四",30);
	}
}
