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
		J_Outer.J_Inner1 c1 = new J_Outer.J_Inner1();// J_Inner1是static
		J_Outer o = new J_Outer();
		J_Outer.J_Inner2 c2 = o.new J_Inner2();// J_Inner2是非static  o也可直接用new J_Outer()代替
		
		System.out.println(J_Outer.J_Inner1.PI);//静态成员域PI的访问，虽然可用c1代替逻辑上争取，但不符合java定制的语法习惯
		System.out.println(c1.Area(10.0));//Area不是静态成员域：c1不可用J_Outer.J_Inner1代替
 
		System.out.println(J_Outer.J_Inner2.FORMAT);//静态成员域FORMAT的访问
		System.out.println(c2.Area(10.0,20.0));//Area不是静态成员域：c2可用new J_Outer().new J_Inner2()代替
	}
}
