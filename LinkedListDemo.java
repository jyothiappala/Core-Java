import java.util.*;
public class LinkedListDemo
{
	public static void main(String arg[])
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("jyothi");
		al.add("priya");
		al.add("aki");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}