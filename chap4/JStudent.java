package chap4;

//例4.2
//JStudent.java
public class JStudent extends JPeople
{
	String studentID;
	String major;
	String name; // 定义一个和父类成员同名的成员变量name

	public String getName() //定义一个和父类成员同名的成员方法getName()
	{
		return "王五";
	}

	
	public String getName2() 
	{
		super.name="张三";    //获得父类被隐藏的成员变量name
		return super.getName();  //调用父类被隐藏的成员方法getName()
	}
	
	public String getMajor()
	{
		return major;
	}

	public String getStudentID()
	{
		return studentID;
	}
}
