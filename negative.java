import java.util.Scanner;
class negative
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean i=str.startsWith("-");
		if(i==true)
			for(int j=1;j<str.length();j++)
			System.out.print(str.charAt(j));
		else
			System.out.println("-1");
	}
}