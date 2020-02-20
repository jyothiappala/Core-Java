class parent
{}
class child4 extends parent
{
	void check()
	{
		System.out.println("success");
	}	
	public static void show(parent p)
	{
		if(p instanceof child4)
		{
			child4 b1=(child4)p;
			b1.check();
		}
	}
	public static void main(String ar[])
	{
		parent p=new child4();
		child4.show(p);
	}
}