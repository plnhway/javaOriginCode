package chap4;

//例4.20
//JPetTest4.java
interface JPet4
{
	void petSkill();

	void petVoice();
}

class JCat4 implements JPet4
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

class JDog4 implements JPet4
{
	public void petSkill() // 实现JPet的petSkill()方法
	{
		System.out.println("I can guard houses");
	}

	public void petVoice() // 实现JPet的petVoice()方法
	{
		System.out.println("汪");
	}

	public void feature()
	{
		System.out.println("Human's friend!");
	}
}

public class JPetTest4
{
	public static void main(String args[])
	{
		JPet4 newCat = new JCat4();
		JPet4 newDog = new JDog4();
		newCat.petSkill();
		newCat.petVoice();
		newDog.petSkill();
		newDog.petVoice();
		//newDog.feature();    //只能使用接口中的方法
	}
}
