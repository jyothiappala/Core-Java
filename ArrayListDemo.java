import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("jyothi");
		list.add("priya");
		list.add("akhi");
		list.add("ash");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}