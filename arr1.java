import java.util.*;
class arr1
{
	public static void main(String ar[])
	{
		ArrayList<Integer> aList=new ArrayList<Integer>(7);
		aList.add(1);
		aList.add(2);
		aList.add(25);
		ArrayList<String> sList=new ArrayList<String>();
		sList.add("JAVA");
		ArrayList<Integer> aList2=new ArrayList<Integer>(5);
		aList2.add(11);
		aList2.add(12);
		aList2.add(13);
		System.out.println(aList2);
		aList.addAll(2,aList2);
		System.out.println(sList);
		System.out.println(aList);
		aList.clear();
	}
}