interface bank
{
	float rate();
}
class icici implements bank
{
	public float  rate(){return 9.15f;}
}
class citi implements bank
{
	public float  rate(){return 10.6f;}
}
class Interface
{
	public static void main(String ar[])
	{
		bank b=new icici();
		System.out.println("roi"+b.rate());
		bank b1=new citi();
		System.out.println("roi"+b1.rate());
	}
}