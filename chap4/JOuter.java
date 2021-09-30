package chap4;

//��4.23
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
			num++; // �������ݵĲ���
			this.num++; // �ڲ���ĳ�Ա����
			JOuter.this.num++; // �ⲿ��JOuter�ĳ�Ա����
			System.out.println("���ڵ�numֵ��: " + num);
			System.out.println("���ڵ�this.numֵ��: " + this.num);
			System.out.println("���ڵ�JOuter.this.numֵ��: " + JOuter.this.num);
		}
	}

	JInner3 i = new JInner3(); // ��Ա����i��JInner3�ڲ����ʵ������

	public void increaseSize(int n)
	{
		i.show(n); // ����JInner3�ڲ���ķ���
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
		return new JInner4(); // ����JInner4()����JInnerInterface�ӿڶ���
	}

	public static void main(String[] a)
	{
		JOuter o = new JOuter();
		o.increaseSize(1000);
		JInnerInterface i = o.makeJInner4();
		i.SayHello();
	}
}
