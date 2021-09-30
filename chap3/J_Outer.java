package chap3;

public class J_Outer
{
	static class J_Inner1
	{
		final static double PI = 3.1415;

		double Area(double r)
		{
			return PI * r * r;
		}
	}

	class J_Inner2
	{
		final static String FORMAT = "[0-9][0-5]";

		double Area(double w, double h)
		{
			return w * h;
		}
	}

	public static void main(String args[])
	{
		J_Outer.J_Inner1 c1 = new J_Outer.J_Inner1();// J_Inner1��static
		J_Outer o = new J_Outer();
		J_Outer.J_Inner2 c2 = o.new J_Inner2();// J_Inner2�Ƿ�static  oҲ��ֱ����new J_Outer()����
		
		System.out.println(J_Outer.J_Inner1.PI);//��̬��Ա��PI�ķ��ʣ���Ȼ����c1�����߼�����ȡ����������java���Ƶ��﷨ϰ��
		System.out.println(c1.Area(10.0));//Area���Ǿ�̬��Ա��c1������J_Outer.J_Inner1����
 
		System.out.println(J_Outer.J_Inner2.FORMAT);//��̬��Ա��FORMAT�ķ���
		System.out.println(c2.Area(10.0,20.0));//Area���Ǿ�̬��Ա��c2����new J_Outer().new J_Inner2()����
	}
}
