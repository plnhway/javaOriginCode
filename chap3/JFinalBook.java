package chap3;

//Àý3.18
//JFinalBook.java
public class JFinalBook
{
	public final int bookID;
	public static int booknumber = 1;

	public JFinalBook()
	{
		bookID = booknumber++;
	}

	public long getID()
	{
		return bookID;
	}

	public static void main(String[] args)
	{
		JFinalBook[] s = new JFinalBook[5];
		for (int i = 0; i < s.length; i++)
		{
			s[i] = new JFinalBook();
			System.out.println("The bookID is " + s[i].getID());
		}
	}
}
