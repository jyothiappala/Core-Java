class MultipleTry
{
	public static void main(String ar[])
	{
		try
		{
			try
			{
				System.out.println("going to divide");
				int b=30/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);	
			}
			try
			{
				int a[]=new int[5];
				a[8]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("other statement");
		}
			catch(Exception e)
			{
				System.out.println("handled");
			}
			System.out.println(".............");
			
	}
}