public class JoinMethodDemo1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon()){
		System.out.println("Daemon");}
		else
			System.out.println("user thread");
			
	}
	public static void main(String ar[])
	{
		JoinMethodDemo t1=new JoinMethodDemo();
		JoinMethodDemo t2=new JoinMethodDemo();
		JoinMethodDemo t3=new JoinMethodDemo();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
	
}