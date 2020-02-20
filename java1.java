import java.util.Scanner;
class java1
{
	public static void main(String a[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Bill NO:");
		int billno= s.nextInt();
		System.out.println("Enter Date:");
		int date=s.nextInt();
		if((date>0 && date<=31) && (billno%100 == date%100 || billno%10 == date%10) || (billno % date ==0))
		{
			System.out.println("YOU ARE THE LUCKY WINNER");
		}			
		else
		{
				
			System.out.println("YOU ARE THE NOT LUCKY WINNER");
		}
	}
}