package chap3;

//��3.11
//JthisConstructTest.java
public class JthisConstructTest
{
	String name;
	int age;

	public JthisConstructTest()
	{
		name = "����";
		age = 20;

	}

	public JthisConstructTest(String name, int age)
	{
		this(); //ͨ��this�����޲ι��췽��
		System.out.println("name=" + this.name + "  age=" + this.age);
	}

	public static void main(String args[])
	{	
		JthisConstructTest test=new JthisConstructTest("����",30);
	}
}
