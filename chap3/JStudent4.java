package chap3;

//Àý3.7
//JStudent4.java
public class JStudent4
{
	String name;
	char sex;
	int stuID;

	public JStudent4()
	{
	}

	public JStudent4(String stuName, char sex, int stuID)
	{
		name = stuName;
		this.sex = sex;
		this.stuID = stuID;
	}

	public void setName(String stuName)
	{
		name = stuName;
	}

	public void setSex(char sex)
	{
		this.sex = sex;
	}

	public void setStuID(int stuID)
	{
		this.stuID = stuID;
	}

	public static void main(String args[])
	{
		JStudent4[] s = new JStudent4[30];
		for (int i = 0; i < s.length; i++)
		{
			s[i] = new JStudent4();
		}
	}
}
