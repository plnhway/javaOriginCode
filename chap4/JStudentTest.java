package chap4;

//例4.4
//JStudentTest.java
public class JStudentTest
{

	public static void main(String[] args)
	{
		JStudent student = new JStudent();
		JPeople p1 = new JStudent();
		JPeople p2 = new JTeacher();
		student.name = "赵六";
		System.out.println("学生姓名是： " + student.name);
		System.out.println("学生姓名是： " + student.getName());
		System.out.println("学生姓名是： " + student.getName2());
	}
}
