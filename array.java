import java.lang.*;
import java.util.*;
class array
{
	static void min(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
	static void min1(int b[])
	{
		
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]);
	}
	public static void main(String ar[])
	{
		int a[]={3,4,5};
		int b[]={1,2,3};
		min(a);
		min1(b);
	}
}