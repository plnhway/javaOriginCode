package chap4;

//��4.20
//JPetTest4.java
interface JPet4
{
	void petSkill();

	void petVoice();
}

class JCat4 implements JPet4
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

class JDog4 implements JPet4
{
	public void petSkill() // ʵ��JPet��petSkill()����
	{
		System.out.println("I can guard houses");
	}

	public void petVoice() // ʵ��JPet��petVoice()����
	{
		System.out.println("��");
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
		//newDog.feature();    //ֻ��ʹ�ýӿ��еķ���
	}
}
