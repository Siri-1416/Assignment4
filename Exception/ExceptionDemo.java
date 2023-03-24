import java.lang.*;
import java.io.*;
import java.util.*;

public class ExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			int a[] = new int[6];
			a[5] = 5/0;
			System.out.println(a[10]);
			

		}
		catch(ArithmeticException e)
		{
			System.out.println("This is an Arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The index limit is out of the limit");
		}
}
}