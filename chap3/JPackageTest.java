package chap3;

import java.util.Calendar; //����Java�Դ���java.util����Calendar
import chap2.JHelloWorldT; //�����Զ����chap2����JHelloWorldT

//��3.19
//JPackageTest.java
public class JPackageTest
{
	public static void main(String args[])
	{
		// ����ֱ��ʹ��JHelloWorldT�����ɶ���
		JHelloWorldT s = new JHelloWorldT(); 
		// ����JHelloWorldT��ĳ�Ա����test()
		s.test(); 
		// �õ�Calendar���ʵ������
		Calendar cal = Calendar.getInstance(); 
		// ��ӡ��ʱ��
		System.out.println(cal.get(Calendar.MONTH) + "��"
				+ cal.get(Calendar.DATE) + "��");
	}
}
