package chap4;

//例4.11
//JConstructionPeople.java
public class JConstructionPeople
{
	private String name;
	private int age;

	public JConstructionPeople(String n, int age)
	{
		name = n;
		this.age = age;
	}

	public JConstructionPeople(String n)
	{
		this(n, 10);
	}

	public JConstructionPeople()
	{
		this("who am i");
	}

	public static void main(String args[])
	{
		JConstructionPeople a1 = new JConstructionPeople();
		JConstructionPeople a2 = new JConstructionPeople("张三");
		System.out.println("对象a1的name是  " + a1.name + "  ;对象a1的age是" + a1.age
				+ "岁");
		System.out.println("对象a2的name是  " + a2.name + "  ;对象a2的age是" + a2.age
				+ "岁");
	}
}
