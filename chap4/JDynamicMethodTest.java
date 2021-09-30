package chap4;

//例4.14
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
		A a = new A(); // 实例化类A，得到A类型的对象a
		B b = new B(); // 实例化类B，得到B类型的对象b
		C c = new C(); // 实例化类C，得到C类型的对象c
		A x; // 声明一个A类型的对象x，即x的引用对象类型为A
		x = a; // 初始化x，被引用的对象类型也是A
		x.Hello(); // x实际执行的是类A的Hello()方法
		x = b; // 初始化x，通过向上转型，此时被引用的对象类型是B
		x.Hello(); // x实际执行的是类B的Hello()方法
		x = c; // 初始化x，通过向上转型，此时被引用的对象类型是C
		x.Hello(); // x实际执行的是类C的Hello()方法

		b = new C(); // 重新初始化b，通过向上转型，此时被引用的对象类型是其子类C
		b.Hello(); // b实际执行的是类C的Hello()方法
	}
}