package chap3;

//��3.2
//JTriangle.java
public class JTriangle //��������
{
	double length = 10.0; //�������
	double height = 5.0; //�������

	//���巽��
	double area() 
	{
		return length * height / 2.0;
	}

	//����main����
	public static void main(String args[])   
	{
		double s; //�������
		s = (new JTriangle()).area();
		System.out.println("�������ε������: " + s);
	}
}
