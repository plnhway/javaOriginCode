package chap4;

//��4.4
//JStudentTest.java
public class JStudentTest
{

	public static void main(String[] args)
	{
		JStudent student = new JStudent();
		JPeople p1 = new JStudent();
		JPeople p2 = new JTeacher();
		student.name = "����";
		System.out.println("ѧ�������ǣ� " + student.name);
		System.out.println("ѧ�������ǣ� " + student.getName());
		System.out.println("ѧ�������ǣ� " + student.getName2());
	}
}
