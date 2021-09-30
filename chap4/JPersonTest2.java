package chap4;

//例4.9
//JPersonTest2.java
class JPerson2
{
	int personId;
	public JPerson2()
	{
		personId=10;
		System.out.println("现在personId的值是"+personId);
	}
}

class JSubPerson2 extends JPerson2
{

	public JSubPerson2(int i)
	{
		personId=i;
		System.out.println("现在personId的值是"+personId);
	}
}

public class JPersonTest2
{
	public static void main(String args[])
	{
		JSubPerson2 j2 = new JSubPerson2(100);
	}
}
