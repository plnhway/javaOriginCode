package chap3;

//��3.6
//JStudent3.java
public class JStudent3
{
	String name;
	char sex;
	int stuID;

	public void setName(String stuName)
	{
		name = stuName;
	}

	public static void main(String args[])
	{
		JStudent3 s1 = new JStudent3();
		s1.name = "����";
		System.out.println("����name��ֵΪ��"+s1.name);
		s1.setName("����");
		System.out.println("����name��ֵ����Ϊ��"+s1.name);
	}
}
