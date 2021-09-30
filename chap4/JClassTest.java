package chap4;

import java.lang.reflect.Constructor;

//Àý4.30
//JClassTest.java
class Class1
{

}

class SubClass1 extends Class1
{
	
}

class JClassTest
{
	public Object process()
	{
		Class1 c1 = new SubClass1();
		return findClass(c1);
	}

	public Object findClass(Class1 class1)
	{
		return class1;
	}

	public static void main(String args[]) throws SecurityException, ClassNotFoundException
	{
		JClassTest c = new JClassTest();
		Object c2 = c.process();
		Class realClass = c2.getClass();
		Class realClass2 = SubClass1.class;
		System.out.println(realClass == realClass2);
		/**
		Constructor [] constructors = Class.forName("chap4.SubClass1").getConstructors();
		for(Constructor x:constructors)
		{
			System.out.println(x.toString());
		}
		*/
	}
}
