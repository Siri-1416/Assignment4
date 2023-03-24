import java.io.*;
import java.lang.*;

class Solution1
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("hello.txt",true);
			fw.write("This is my new file..!");
			fw.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
