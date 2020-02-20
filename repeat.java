import java.util.*;
class repeat
{
	public static void main(String ar[])
	{
		int i,k,c=0,j;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j) && i != j){
					c++;}
			}
		}
		k=str.length()-c;
		System.out.println(k);
	}
}