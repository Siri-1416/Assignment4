import java.lang.*;
import java.io.*;
import java.util.*;

public class GenericSample
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("10");
		String s = list.get(0);
		System.out.println(list);
		System.out.println(s);
	}
}