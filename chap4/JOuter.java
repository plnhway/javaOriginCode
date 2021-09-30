package chap4;

//例4.23
//JOuter.java
interface JInnerInterface
{
	void SayHello();
}

public class JOuter
{
	private int num = 10;

	public class JInner3
	{
		private int num = 100;

		public void show(int num)
		{
			num++; // 方法传递的参数
			this.num++; // 内部类的成员变量
			JOuter.this.num++; // 外部类JOuter的成员变量
			System.out.println("现在的num值是: " + num);
			System.out.println("现在的this.num值是: " + this.num);
			System.out.println("现在的JOuter.this.num值是: " + JOuter.this.num);
		}
	}

	JInner3 i = new JInner3(); // 成员变量i是JInner3内部类的实例对象

	public void increaseSize(int n)
	{
		i.show(n); // 调用JInner3内部类的方法
	}

	public JInnerInterface makeJInner4()
	{
		class JInner4 implements JInnerInterface
		{
			public void SayHello()
			{
				System.out.println("Hello");
			}
		}
		return new JInner4(); // 方法JInner4()返回JInnerInterface接口对象
	}

	public static void main(String[] a)
	{
		JOuter o = new JOuter();
		o.increaseSize(1000);
		JInnerInterface i = o.makeJInner4();
		i.SayHello();
	}
}
