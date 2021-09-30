package chap4;

//��4.15
//JShapeTest.java
//���������JShape
abstract class JShape
{
	int JShapeId;  //����ӵ�г�Ա����
	
	protected void getJShapeId()  //����ӵ�о���ʵ�ֵķ���
	{
		System.out.println(JShapeId);
	}
	
	abstract protected double area(); // ������󷽷�area()

	abstract protected void draw(); // ������󷽷�draw()
}

// ����һ���������̳г�����JShape
class JRectangle extends JShape
{
	float width, length;

	JRectangle(float w, float l) // ���幹�췽��
	{
		width = w;
		length = l;
	}

	public double area() // �Ը���ĳ��󷽷����о���ʵ��
	{
		return width * length;
	}

	public void draw() // �Ը���ĳ��󷽷����о���ʵ��
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
