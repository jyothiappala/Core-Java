class FinallyBlockDemo
{
	public static void main(String ar[])
	{
		try
		{
			int data=3/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);		
		}
		finally
		{
			System.out.println("finally block");
			System.out.println("rest");
		}
	}
}