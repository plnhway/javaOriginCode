package chap4;

//例4.17
//JPetTest.java
interface JPet
{
	void petSkill();

	void petVoice();
}

class JCat implements JPet
{
	public void petSkill() // 实现JPet的petSkill()方法
	{
		System.out.println("I can climb trees");
	}

	public void petVoice() // 实现JPet的petVoice()方法
	{
		System.out.println("喵");
	}
}

class JDog implements JPet
{
	public void petSkill() // 实现JPet的petSkill()方法
	{
		System.out.println("I can guard houses");
	}

	public void petVoice() // 实现JPet的petVoice()方法
	{
		System.out.println("汪");
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
