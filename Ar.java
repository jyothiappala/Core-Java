import java.io.*;
class Ar
{
	void method()throws IOException
	{
		System.out.println("IO exception");
	}
}
class ThrowsDEMO
{
	public static void main(String[] args)throws IOException
	{
		Ar obj=new Ar();
		obj.method();	
	System.out.println("Further process");
	}
}