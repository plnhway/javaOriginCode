package chap3;

//��3.15
//JBook.java
public class JBook
{
	public int id; // ��ı��
	public static int bookNumber = 0; // �������

	public JBook()
	{
		++bookNumber;
	}// JBook���췽������

	public void info()
	{
		System.out.println("��ǰ��ı���ǣ�" + id);
	} // ����info����

	public static void infoStatic()
	{
		System.out.println("��������ǣ�" + bookNumber);
	} // ��̬�������þ�̬����

	public static void main(String args[])
	{
		JBook a = new JBook();
		JBook b = new JBook();
		a.id = 1101;
		b.id = 1234;
		System.out.print("����a��Ӧ��");
		a.info();
		System.out.print("����b��Ӧ��");
		b.info();
		JBook.infoStatic();
		System.out.println("�Ƚ�(a.bookNumber==Book.bookNumber)" + "�Ľ���ǣ�"
				+ (a.bookNumber == JBook.bookNumber));
		System.out.println("�Ƚ�(b.bookNumber==Book.bookNumber)" + "�Ľ���ǣ�"
				+ (b.bookNumber == JBook.bookNumber));
	}
}
