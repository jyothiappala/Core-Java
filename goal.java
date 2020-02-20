class bike
{
	bike(String a)
	{
		
		System.out.println("bike "+a);
	}
}
class cycle extends bike
{
	cycle()
	{
		super("hello ");
		System.out.println("cycle");
	}
}
class goal
{
	public static void main(String ar[])
	{
		cycle c=new cycle();
	}
}