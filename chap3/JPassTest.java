package chap3;

//��3.9
//JPassTest.java
public class JPassTest
{
	float ptValue;

	// ���������ǻ�����������
	public void changeInt(int value)
	{
		value = 55;
	}

	// ����������������������
	public void changeStr(String value)
	{
		value = new String("world");
	}

	// ����������������������
	public void changeObjValue(JPassTest ref)
	{
		ref.ptValue = 99.0f;
	}

	public static void main(String args[])
	{
		String str;
		int val;
		// ����JPassTest��Ķ���
		JPassTest pt = new JPassTest();
		// ���Ի����������Ͳ����Ĵ���
		val = 11;
		pt.changeInt(val);
		System.out.println("Int value is: " + val);
		// ���������������Ͳ����Ĵ���
		str = new String("Hello");
		pt.changeStr(str);
		System.out.println("Str value is: " + str);
		// ���������������Ͳ����Ĵ���
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("Pt value is: " + pt.ptValue);
	}
}
