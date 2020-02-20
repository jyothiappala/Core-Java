import java.util.Scanner;
class java4
{
	public static void main(String args[])
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Weight");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("IT CAN BE DIVIDED");
		}
		else
			System.out.println("IT CANNOT BE DIVIDED");
		for(i=1;i<n;i++)
		{
			System.out.println("PROBABILITY" +" "+i+" "+(n-i));
		}
	}
}