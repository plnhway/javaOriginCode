package chap3;

//��3.4
//JStudent.java
public class JStudent
{
	String name;
	char sex;
	int stuID;

	// ���췽��1
	public JStudent(String stuName, char sex, int stuID)
	{
		name = stuName;
		this.sex = sex;
		this.stuID = stuID;
	}

	// ���췽��2
	public JStudent()
	{
	}

	// ����main����
	public static void main(String args[])
	{
		JStudent s1 = new JStudent("����", 'M', 20130301); // ͨ�����췽��1��ʼ������
		JStudent s2 = new JStudent(); // ͨ�����췽��2��ʼ������
	}
}
