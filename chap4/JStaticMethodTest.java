package chap4;

//例4.13
//JStaticMethodTest.java
class JStaticMethod
{
	public void One(int i){}
	public void Two(int i){}
	public static void Three(int i){}
	public static void Four(int i){}

}

class JSubStaticMethod extends JStaticMethod
{
	public void One(int i){}
	//public static void Two(int i){}  //编译出错，无法将父类的非静态方法覆盖为静态方法
	public static void Three(int i){}
	//public void Four(int i){}  ////编译出错，无法将父类的静态方法覆盖为非静态方法
}


