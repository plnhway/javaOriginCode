package chap3;

//��3.8
//JStudent4Test.java
public class JStudent4Test
{
	public static void main(String args[])
	{
		JStudent4 s1 = new JStudent4();
		s1.setName("����");
		s1.setSex('M');
		s1.setStuID(20130201);
		JStudent4 s2 = new JStudent4("����", '��', 20130301);
		s2 = s1;
		s1 = null;
	}
}
