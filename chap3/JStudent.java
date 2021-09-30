package chap3;

//例3.4
//JStudent.java
public class JStudent
{
	String name;
	char sex;
	int stuID;

	// 构造方法1
	public JStudent(String stuName, char sex, int stuID)
	{
		name = stuName;
		this.sex = sex;
		this.stuID = stuID;
	}

	// 构造方法2
	public JStudent()
	{
	}

	// 定义main方法
	public static void main(String args[])
	{
		JStudent s1 = new JStudent("张三", 'M', 20130301); // 通过构造方法1初始化变量
		JStudent s2 = new JStudent(); // 通过构造方法2初始化变量
	}
}
