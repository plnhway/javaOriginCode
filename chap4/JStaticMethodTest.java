package chap4;

//��4.13
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
	//public static void Two(int i){}  //��������޷�������ķǾ�̬��������Ϊ��̬����
	public static void Three(int i){}
	//public void Four(int i){}  ////��������޷�������ľ�̬��������Ϊ�Ǿ�̬����
}


