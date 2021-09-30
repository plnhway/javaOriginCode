package chap3;

//例3.5
//JStudent2.java
public class JStudent2
{
	String name;
	char sex;
	int stuID;

	public static void main(String args[])
	{
		// 下面语句去除注释后会发生编译错误
		// JStudent2 s1 = new JStudent2("张三", '男', 20130301);
		JStudent2 s2 = new JStudent2(); // 通过默认构造方法初始化变量
	}
}
