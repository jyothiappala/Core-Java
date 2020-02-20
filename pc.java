class parent
{
	void view()
	{
		System.out.println("this is a parent class method");
	}
}
class child extends parent
{
	void view()
	{
		System.out.println("this is a child class method");
		super.view();
	}
	child()
	{
		super.view();
	}
}
class pc
{
	public static void main(String ar[])
	{
		parent ob=new child();
		ob.view();
		}
}