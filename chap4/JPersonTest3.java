package chap4;

//��4.10
//JPersonTest3.java
class JPerson3
{
	int personId;

	public JPerson3()
	{
	}

	public JPerson3(int i)
	{
		personId = i;
		System.out.println("����personId��ֵ��" + personId);
	}

	public JPerson3(int i, int j)
	{
		personId = i + j;
		System.out.println("����personId��ֵ��" + personId);
	}

}

class JSubPerson3 extends JPerson3
{
	public JSubPerson3()
	{
	}

	public JSubPerson3(int i)
	{
		super(i); // �����ֻ��λ�ڹ��췽����һ��
		// super(i,1000);
		System.out.println("����personId��ֵ��" + personId);
	}

}

public class JPersonTest3
{
	public static void main(String args[])
	{
		JSubPerson3 j3 = new JSubPerson3(100);
		JSubPerson3 j4 = new JSubPerson3();
	}
}
