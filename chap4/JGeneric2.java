package chap4;

//Àý4.28
//JGeneric2.java
class Hello2
{
	public String toString()
	{
		return "Hello";
	}
	
	public int GetNum()
	{
		return 0;
	}
}

class SubHello2 extends Hello2
{

	private int num;

	SubHello2(int num)
	{
		this.num = num;
	}

	public int GetNum()
	{
		return num;
	}
}

public class JGeneric2<T extends Hello2>
{
	public String test(T t)
	{
		return (t.toString() + " , Number is  " + t.GetNum());
	}

	public static void main(String args[]) 
	{
		JGeneric2<SubHello2> j = new JGeneric2<SubHello2>();
		SubHello2 t = new SubHello2(100);
		System.out.println(j.test(t));
	}
}
