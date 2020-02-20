import java.util.Scanner;
class j2
{
	public static void main(String arg[])
	{
		int n=5;
		int b[]={1,2,3,4,5};
		for(int i:b)
		{
			System.out.println(i);
		}
		aa:for(int k=0;k<n;k++)
			bb:for(int j=0;j<n;j++)
			{
				System.out.println(k+j);
				if(j==3)
				{
					break aa;
				}
			}
	}
}