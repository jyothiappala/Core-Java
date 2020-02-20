import  java.io.File;
import java.io.IOException;
public class createFile
{
	public static void main(String ar[])
	{
		String s="heloooooo";
		try
		{
			File obj=new File("c:file.txt");
			if(obj.createNewFile())
			{
				System.out.println("File ="+obj.getName());
			}
			else
			{
				System.out.println("File already exits");
			}
			System.out.println(obj.length());
			System.out.println(obj.canWrite());
			System.out.println(obj.canRead());
			System.out.println(obj.getAbsolutePath());
			System.out.println(obj.getName());
			obj.write(s);
		}
		catch(IOException e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
	}
}