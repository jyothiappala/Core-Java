import java.util.Scanner;
class java3
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter no of Students");
		int n=s.nextInt();
		System.out.println("Enter no of Choclates");
		int m=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(m>i)
			{
				m=m-i;
			}
			else
			{
				--i;
				System.out.println("NO OF CHOCLATES LEFT"+m+"UP TO CHILDREN"+i+" "+"remaining"+ (n-i));
				break;
			}
		}
	}
}