package chap4;

//��4.24
//JInnerClass.java

//����һ��������JClass��JInnerClass�������ɵ������ڲ�����������
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
		//�����ڲ��ඨ����ʵ�������̣���󷵻ص���JClass�����c
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
