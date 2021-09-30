package chap4;

//例4.18
//JPetTest2.java
interface JPet2
{
	String petName="宠物类";
	
	void petSkill();
}

class JCat2 implements JPet2
{
    String  getpetName()
    {
    	return petName+"：猫";  //直接调用接口中的常量
    }
	
	public void petSkill() // 实现JPet的petSkill()方法
	{
		System.out.println("I can climb trees");
	}
}


public class JPetTest2
{
	public static void main(String args[])
	{
		JCat2 cat2 = new JCat2();
		cat2.petSkill();
		System.out.println(cat2.getpetName());
	
	}
}
