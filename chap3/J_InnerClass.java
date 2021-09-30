package chap3;

abstract class J_Class
{
	int m_data;

	public J_Class(int i)
	{
		m_data = i;
	} // J_Class���췽������

	public abstract void mb_method();
} // J_Class����

public class J_InnerClass
{
	public static void main(String args[])
	{
		J_Class b = new J_Class(5)
		{
			public void mb_method()
			{
				System.out.println("m_data=" + m_data);
			} // ����mb_method����
		}; // ������Ϊ��J_Class�������ڲ������
		b.mb_method();
	} // ����main����
} // ��J_InnerClass����
