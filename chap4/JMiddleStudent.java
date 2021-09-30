package chap4;

//Àý4.5
//JMiddleStudent.java
public class JMiddleStudent extends JStudent
{
	public static void main(String[] args)
	{
		JMiddleStudent middleStudent = new JMiddleStudent();
		System.out.println("name ="+middleStudent.name);
		System.out.println("major ="+middleStudent.major);
		System.out.println("age ="+middleStudent.getAge());
	}
}
