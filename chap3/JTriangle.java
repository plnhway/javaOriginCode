package chap3;

//例3.2
//JTriangle.java
public class JTriangle //类首声明
{
	double length = 10.0; //定义变量
	double height = 5.0; //定义变量

	//定义方法
	double area() 
	{
		return length * height / 2.0;
	}

	//定义main方法
	public static void main(String args[])   
	{
		double s; //定义变量
		s = (new JTriangle()).area();
		System.out.println("该三角形的面积是: " + s);
	}
}
