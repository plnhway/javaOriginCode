package chap4;

//��4.11
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
		JConstructionPeople a2 = new JConstructionPeople("����");
		System.out.println("����a1��name��  " + a1.name + "  ;����a1��age��" + a1.age
				+ "��");
		System.out.println("����a2��name��  " + a2.name + "  ;����a2��age��" + a2.age
				+ "��");
	}
}
