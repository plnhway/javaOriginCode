package chap4;

//Àý4.8
//JPersonTest.java
class JPerson
{
	int personId;
	public JPerson()
	{
		personId=10;
	}
}

class JSubPerson extends JPerson
{

}

public class JPersonTest
{
	public static void main(String args[])
	{
		JSubPerson j1 = new JSubPerson();
		System.out.println(j1.personId);
	}
}
