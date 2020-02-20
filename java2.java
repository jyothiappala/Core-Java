import java.util.Scanner;
class java2
{
	public static void main(String args[])
	{
		int sum = 0,i=0,min;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of Products");
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Rate of product"+i);
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		min=a[0];
		for(i=0;i<n;i++)
		{
			if(min > a[i])
			{
				min=a[i];
			}
		}
		if(sum * 0.2 > min){
			System.out.println("YOU GOT 20% OFF");}
		else{
			System.out.println("YOU GOT FREE LEAST PRODUCT");}
	}	
}