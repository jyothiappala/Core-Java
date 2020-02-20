class InvalidAgeException extends Exception
{
	InvalidAgeException(String s){super(s);}
}
class custom
{
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("not eligible");
		else
			System.out.println("account is opened");
	}
	public static void main(String args[])
	{
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);	
		}
		System.out.println("further process");
	}
}