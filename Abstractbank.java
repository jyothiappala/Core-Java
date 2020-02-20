abstract class bank
{
	abstract int get();
}
class axis extends bank
{
	int get(){return 10;}
}
class hdfc extends bank
{
	int get(){return 20;}
}
class Abstractbank
{
	
	public static void main(String ar[])
	{
		bank b;
		b=new axis();
		System.out.println("rate=: "+b.get());
		b=new hdfc();
		System.out.println("rate=: "+b.get());
	}
}