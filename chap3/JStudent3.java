package chap3;

//例3.6
//JStudent3.java
public class JStudent3
{
	String name;
	char sex;
	int stuID;

	public void setName(String stuName)
	{
		name = stuName;
	}

	public static void main(String args[])
	{
		JStudent3 s1 = new JStudent3();
		s1.name = "张三";
		System.out.println("变量name的值为："+s1.name);
		s1.setName("李四");
		System.out.println("变量name的值现在为："+s1.name);
	}
}
