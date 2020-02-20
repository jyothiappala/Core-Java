import java.util.*;
class last1
{
	public static void main(String ar[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:");
		n = Integer.parseInt(s.nextLine());
		ArrayList<String> list=new ArrayList<String>(n);
		for(i=0;i<n;i++)
		{
			System.out.print("enter values:");
			list.add(s.nextLine());
		}
		String str=new String();
     		for(i=0;i<n;i++)
       		{
			str= list.get(i);
      			char ch=str.charAt(str.length()-1);
			System.out.print("ba"+ch);
			System.out.println();
		}
		
	}
}