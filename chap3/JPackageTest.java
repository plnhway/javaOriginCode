package chap3;

import java.util.Calendar; //导入Java自带包java.util的类Calendar
import chap2.JHelloWorldT; //导入自定义包chap2的类JHelloWorldT

//例3.19
//JPackageTest.java
public class JPackageTest
{
	public static void main(String args[])
	{
		// 可以直接使用JHelloWorldT类生成对象
		JHelloWorldT s = new JHelloWorldT(); 
		// 调用JHelloWorldT类的成员方法test()
		s.test(); 
		// 得到Calendar类的实例对象
		Calendar cal = Calendar.getInstance(); 
		// 打印出时间
		System.out.println(cal.get(Calendar.MONTH) + "月"
				+ cal.get(Calendar.DATE) + "日");
	}
}
