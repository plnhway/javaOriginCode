package chap3;

//��3.17
//JFinalTest.java
public class JFinalTest
{
	final static int number = 100;//���������ܸģ����븳ֵ

	public void setValue(final int a, int b)
	{
		//a = b;
		b = 10;
	}

	public static void main(String args[])
	{
		// �������ȥ��ע�ͺ����������final���εı���number�޷��ٴθ�ֵ
		// JFinalTest.number=200;
		final JPerson2 s1 = new JPerson2(); // ʵ������3.13��JPerson2��
		JPerson2 s2 = new JPerson2();
		// �������ȥ��ע�ͺ����������final���εı���s1�޷��ٴθ�ֵ
		// s1=s2;
		s1.setValue(30, "����");
		System.out.println("s1.age��ֵΪ" + s1.age + "  s1.counrty��ֵΪ"
				+ s1.country);
	}
}
