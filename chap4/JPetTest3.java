package chap4;

//��4.19
//JPetTest3.java
interface JAnimal
{
	String getLegNumbers();
}

interface JPet3 extends JAnimal
{
	String petName = "������";

	void petSkill();
}

class JCat3 implements JPet3
{
	String getpetName()
	{
		return petName + "��è"; // ֱ�ӵ��ýӿ��еĳ���
	}

	public void petSkill() // ʵ��JPet��petSkill()����
	{
		System.out.println("I can climb trees");
	}

	public String getLegNumbers()  //����Ҫʵ��JAnimal�ӿڵķ���������������
	{
		return "è��������";
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
