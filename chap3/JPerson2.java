package chap3;

//��3.13
//JPerson2.java
public class JPerson2
{
	static String name = "����";
	int age = 20;
	String country = "�й�";

	public static String setName(String n)
	{
		name = n;
		return name;
	}

	public void setValue(int age, String country)
	{
		this.age = age;
		this.country = country;
	}
}
