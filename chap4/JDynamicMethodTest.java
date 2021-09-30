package chap4;

//��4.14
//JDynamicMethodTest.java
class A
{
	public void Hello()
	{
		System.out.println("Hello,here is A");
	}
}

class B extends A
{
	public void Hello()
	{
		System.out.println("Hello,here is B");
	}
}

class C extends B
{
	public void Hello()
	{
		System.out.println("Hello,here is C");
	}
}

public class JDynamicMethodTest
{
	public static void main(String args[])
	{
		A a = new A(); // ʵ������A���õ�A���͵Ķ���a
		B b = new B(); // ʵ������B���õ�B���͵Ķ���b
		C c = new C(); // ʵ������C���õ�C���͵Ķ���c
		A x; // ����һ��A���͵Ķ���x����x�����ö�������ΪA
		x = a; // ��ʼ��x�������õĶ�������Ҳ��A
		x.Hello(); // xʵ��ִ�е�����A��Hello()����
		x = b; // ��ʼ��x��ͨ������ת�ͣ���ʱ�����õĶ���������B
		x.Hello(); // xʵ��ִ�е�����B��Hello()����
		x = c; // ��ʼ��x��ͨ������ת�ͣ���ʱ�����õĶ���������C
		x.Hello(); // xʵ��ִ�е�����C��Hello()����

		b = new C(); // ���³�ʼ��b��ͨ������ת�ͣ���ʱ�����õĶ���������������C
		b.Hello(); // bʵ��ִ�е�����C��Hello()����
	}
}