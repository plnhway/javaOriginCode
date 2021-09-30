package chap4;

//例4.24
//JInnerClass.java

//定义一个抽象类JClass，JInnerClass类中生成的匿名内部类是其子类
abstract class JClass
{
	int num;

	public JClass(int i)
	{
		num = i;
	}

	public abstract void showNum();
}

public class JInnerClass
{
	public static void main(String args[])
	{
		//匿名内部类定义与实例化过程，最后返回的是JClass类对象c
		JClass c = new JClass(5)
		{
			public void showNum()
			{
				System.out.println("num = " + num);
			}
		};
		c.showNum();
	}
}
