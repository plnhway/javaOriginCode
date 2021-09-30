package chap4;

//例4.15
//JShapeTest.java
//定义抽象类JShape
abstract class JShape
{
	int JShapeId;  //可以拥有成员变量
	
	protected void getJShapeId()  //可以拥有具体实现的方法
	{
		System.out.println(JShapeId);
	}
	
	abstract protected double area(); // 定义抽象方法area()

	abstract protected void draw(); // 定义抽象方法draw()
}

// 定义一个子类来继承抽象类JShape
class JRectangle extends JShape
{
	float width, length;

	JRectangle(float w, float l) // 定义构造方法
	{
		width = w;
		length = l;
	}

	public double area() // 对父类的抽象方法进行具体实现
	{
		return width * length;
	}

	public void draw() // 对父类的抽象方法进行具体实现
	{
	};
}

public class JShapeTest
{
	public static void main(String args[])
	{
		JRectangle r = new JRectangle(10, 20);
		System.out.println("The area of rectangle:" + r.area());
		JShape s=new JRectangle(10, 20);
		s.getJShapeId();
	}
}
