package chap3;

//��3.14
//JStaticTest.java
public class JStaticTest
{
	String testName;

	public static void main(String args[])
	{
		JStaticTest s = new JStaticTest();
		s.testName = JPerson2.name; // ������ĵ���
		System.out.println("testName��ֵΪ " + s.testName);
		s.testName = JPerson2.setName("����"); // �෽���ĵ���
		System.out.println("JPerson2.name��ֵΪ " + JPerson2.name);
		System.out.println("����testName��ֵΪ  " + JPerson2.name);
	}
}
