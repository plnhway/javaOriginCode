package chap4;

//��4.2
//JStudent.java
public class JStudent extends JPeople
{
	String studentID;
	String major;
	String name; // ����һ���͸����Աͬ���ĳ�Ա����name

	public String getName() //����һ���͸����Աͬ���ĳ�Ա����getName()
	{
		return "����";
	}

	
	public String getName2() 
	{
		super.name="����";    //��ø��౻���صĳ�Ա����name
		return super.getName();  //���ø��౻���صĳ�Ա����getName()
	}
	
	public String getMajor()
	{
		return major;
	}

	public String getStudentID()
	{
		return studentID;
	}
}
