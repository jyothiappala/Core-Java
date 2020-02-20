import java.util.Scanner;
class num
{
	public static void main(String ar[])
	{
		double a,b,a1,a2,a3,sum=0;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		a=s.nextDouble();
		while(a !=0)
		{
			a1=a%10;
			a2=a1%10;
			c++;
			a3=a1-a2;
			if(c>=2)
			{
				sum=sum*1000+a3;	
			}
			else
			{
				sum=sum*1000+a1;
			}
			a=a/10;
		}
		System.out.println(sum);
	}
}