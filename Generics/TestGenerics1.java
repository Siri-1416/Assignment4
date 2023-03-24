import java.lang.*;
import java.io.*;
import java.util.*;

class TestGenerics1
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sireesha");
		list.add("David");
            list.add("rahul");
            
            System.out.println(list);
		
		String s = list.get(1);
		System.out.println("Second element is : "+s);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}