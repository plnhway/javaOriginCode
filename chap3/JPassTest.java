package chap3;

//例3.9
//JPassTest.java
public class JPassTest
{
	float ptValue;

	// 参数类型是基本数据类型
	public void changeInt(int value)
	{
		value = 55;
	}

	// 参数类型是引用数据类型
	public void changeStr(String value)
	{
		value = new String("world");
	}

	// 参数类型是引用数据类型
	public void changeObjValue(JPassTest ref)
	{
		ref.ptValue = 99.0f;
	}

	public static void main(String args[])
	{
		String str;
		int val;
		// 创建JPassTest类的对象
		JPassTest pt = new JPassTest();
		// 测试基本数据类型参数的传递
		val = 11;
		pt.changeInt(val);
		System.out.println("Int value is: " + val);
		// 测试引用数据类型参数的传递
		str = new String("Hello");
		pt.changeStr(str);
		System.out.println("Str value is: " + str);
		// 测试引用数据类型参数的传递
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("Pt value is: " + pt.ptValue);
	}
}
