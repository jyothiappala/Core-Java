import java.util.*;
class arr3
{
	public static void main(String ar[])
	{
		ArrayList<Integer> aList=new ArrayList<Integer>(7);
		aList.add(1);
		aList.add(2);
		aList.add(25);
		ArrayList<String> sList=new ArrayList<String>();
		sList.add("JAVA");
		int value1=sList.indexOf("");
		System.out.println(value1);
		ArrayList<Integer> aList2=new ArrayList<Integer>(5);
		aList2.add(11);
		aList2.add(12);
		aList2.add(13);
		System.out.println(aList.get(1));
		boolean flag=aList2.contains(11);
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("No");
		aList.addAll(2,aList2);
		System.out.println(sList);
		System.out.println(aList);
		aList.clear();
	}
}