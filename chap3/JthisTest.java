package chap3;

//��3.10
//JthisTest.java
public class JthisTest
{
	String a;
	char b;
	int c;

	public void setValue1(String aa, char bb, int cc)
	{
		this.a = aa; // ����ȥ��this�ؼ���
		this.b = bb; // ����ȥ��this�ؼ���
		this.c = cc; // ����ȥ��this�ؼ���
	}

	public void setValue2(String a, char b, int c)
	{
		this.a = a; // ����ȥ��this�ؼ���
		this.b = b; // ����ȥ��this�ؼ���
		this.c = c; // ����ȥ��this�ؼ���
	}

	public static void main(String args[])
	{
		JthisTest s = new JthisTest();
		s.setValue1("hello", 'X', 10);
		System.out.println("ִ��setValue1������������a=" + s.a + " b=" + s.b + " c="
				+ s.c);
		s.setValue2("hi", 'Y', 100);
		System.out.println("ִ��setValue2������������a=" + s.a + " b=" + s.b + " c="
				+ s.c);
	}
}
