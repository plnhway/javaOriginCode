package chap3;

//例3.13
//JPerson2.java
public class JPerson2
{
	static String name = "王五";
	int age = 20;
	String country = "中国";

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
