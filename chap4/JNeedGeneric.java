package chap4;

//例4.29
//JGeneric2.java
class JNoGeneric
{
	public Boolean method(Boolean b)
	{
		return b;
	}

	public Integer method(Integer i)
	{
		return i;
	}
}

class JNoGeneric2
{
	public Object method(Object o)
	{
		return o;
	}
}

public class JNeedGeneric<T>
{
	public T method(T i)
	{
		return i;
	}

	public static void main(String args[])
	{
		//使用泛型
		JNeedGeneric<Boolean> j1 = new JNeedGeneric<Boolean>();
		Boolean b1 = j1.method(new Boolean(true));
		System.out.println(b1);
		JNeedGeneric<Integer> j2 = new JNeedGeneric<Integer>();
		Integer i1 = j2.method(new Integer(100));
		System.out.println(i1);
		//不使用泛型
		JNoGeneric jNo = new JNoGeneric();
		Boolean b2 = jNo.method(new Boolean(false));
		System.out.println(b2);
		Integer i2 = jNo.method(new Integer(100));
		System.out.println(i2);
		//不使用泛型
		JNoGeneric2 jNo2 = new JNoGeneric2();
		//如果把Boolean改成String，能通过编译，但无法执行
		Boolean b3 = (Boolean) jNo2.method(new Boolean(false));
		System.out.println(b3);
		Integer i3 = (Integer) jNo2.method(new Integer(100));
		System.out.println(i3);
	}
}
