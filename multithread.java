import java.util.*;
class multithread implements Runnable
{
	public void run()
	{
		System.out.println("thread is running...");
	}
	public static void main(String ar[])
	{
		multithread t=new multithread();
		Thread t1=new Thread(t);
		t1.start();
	}
}