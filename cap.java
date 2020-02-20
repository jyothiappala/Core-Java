import java.util.*;
class cap
{

	public static void main(String at[])
	{
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		int c=s.nextInt();
		System.out.println("enter List");
		for(int i=0;i<c;i++)
			list.add(s.nextLine());
		System.out.println("enter string");
		String str1=s.nextLine();
		int v=list.indexOf(str1);
		String str2=list.get(v);
		System.out.println(str2);
	}
}