package chap4;

//��4.18
//JPetTest2.java
interface JPet2
{
	String petName="������";
	
	void petSkill();
}

class JCat2 implements JPet2
{
    String  getpetName()
    {
    	return petName+"��è";  //ֱ�ӵ��ýӿ��еĳ���
    }
	
	public void petSkill() // ʵ��JPet��petSkill()����
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
