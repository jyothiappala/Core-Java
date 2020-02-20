import java.util.*;
class parent
{
	
	static int data=10;
	parent()
	{System.out.println("parent1");}
	public void p1()
	{
		System.out.println("parent");
	}
}
public class child extends parent
{
	public void c1()
	{
		System.out.println("child");
	}
	public static void main(String ar[])
	{
		child cobj=new child();
		System.out.println(data);
		cobj.c1();
		cobj.p1();
	}
} 