class a
{
	a()
	{System.out.println("constructor a");}
	public void ma(){
	System.out.println("Super class");}
}
class b extends a
{
	b()
	{System.out.println("constructor b");}
	public void mb(){
	System.out.println("class b");}
}
class c extends a
{
	c()
	{System.out.println("constructor c");}
	public void mc()
	{
		System.out.println("class c");
	}
	public static void main(String args[])
	{
		a obj1=new a();	
		b obj2=new b();
		c obj3=new c();
	}
}