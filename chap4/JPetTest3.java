package chap4;

//例4.19
//JPetTest3.java
interface JAnimal
{
	String getLegNumbers();
}

interface JPet3 extends JAnimal
{
	String petName = "宠物类";

	void petSkill();
}

class JCat3 implements JPet3
{
	String getpetName()
	{
		return petName + "：猫"; // 直接调用接口中的常量
	}

	public void petSkill() // 实现JPet的petSkill()方法
	{
		System.out.println("I can climb trees");
	}

	public String getLegNumbers()  //必须要实现JAnimal接口的方法，否则编译出错
	{
		return "猫有四条腿";
	}
}

public class JPetTest3
{
	public static void main(String args[])
	{
		JCat3 cat3 = new JCat3();
		cat3.petSkill();
		System.out.println(cat3.getpetName());
		System.out.println(cat3.getLegNumbers());
	}
}
