package chap3;

//��3.1
//JNotebookPC.java
public class JNotebookPC
{
	double measurement; // ����ߴ�
	String color; // ������ɫ
	String shape; // ������״

	public void turnOn()
	{
		// ִ�п�������
	}

	public void turnOff()
	{
		// ִ�йػ�����
	}

	public static void main(String[] args)
	{
		JNotebookPC MyPC1 = new JNotebookPC(); //����һ̨����ıʼǱ�����
		MyPC1.color = "black";
		MyPC1.shape = "width";
		MyPC1.measurement = 14;
	}
}
