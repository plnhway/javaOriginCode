package chap3;

//例3.1
//JNotebookPC.java
public class JNotebookPC
{
	double measurement; // 定义尺寸
	String color; // 定义颜色
	String shape; // 定义形状

	public void turnOn()
	{
		// 执行开机功能
	}

	public void turnOff()
	{
		// 执行关机功能
	}

	public static void main(String[] args)
	{
		JNotebookPC MyPC1 = new JNotebookPC(); //定义一台具体的笔记本电脑
		MyPC1.color = "black";
		MyPC1.shape = "width";
		MyPC1.measurement = 14;
	}
}
