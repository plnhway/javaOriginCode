package chap4;

//Àý4.26
//JCat6.java
interface JPet6
{
	void name();
}

class JSmallAnimal
{
	public void name()
	{
		System.out.println("class: JSmallAnimal---method: name");
	}
}

public class JCat6 extends JSmallAnimal
{
	private class JCatInner implements JPet6
	{
		public void name()
		{
			System.out.println("class: JCat6.JCatInner---method: name");
		}
	}

	public static void main(String args[])
	{
		JCat6 cat = new JCat6();
		cat.name();
		cat.new JCatInner().name();
	}
}
