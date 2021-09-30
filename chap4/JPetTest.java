package chap4;

//��4.17
//JPetTest.java
interface JPet
{
	void petSkill();

	void petVoice();
}

class JCat implements JPet
{
	public void petSkill() // ʵ��JPet��petSkill()����
	{
		System.out.println("I can climb trees");
	}

	public void petVoice() // ʵ��JPet��petVoice()����
	{
		System.out.println("��");
	}
}

class JDog implements JPet
{
	public void petSkill() // ʵ��JPet��petSkill()����
	{
		System.out.println("I can guard houses");
	}

	public void petVoice() // ʵ��JPet��petVoice()����
	{
		System.out.println("��");
	}
}

public class JPetTest
{
	public static void main(String args[])
	{
		JCat cat = new JCat();
		cat.petSkill();
		cat.petVoice();
		JDog dog = new JDog();
		dog.petSkill();
		dog.petVoice();
	}
}
