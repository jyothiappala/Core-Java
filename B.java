class B
{
	void ex()
	{
		System.out.println("current class");}
	}
	void display()
	{
		System.out.println("hello n");
		ex();
		this.ex();
	}
}
class Main()
{
	public static void main(String args[])
	{
		B a=new B();
		a.display();
	}
}