class multi
{
	protected String str;
	int data=11;
	multi(){
	int data=11;
	str="This ";}
}
class child1 extends multi
{
	child1(){
	System.out.println(data);
	str=str.concat("is ");}
}
class child2 extends child1
{
	public int data=10;
	child2(){
	int data=10;
	str=str.concat("Multilevel inheritance ");}
}
class child3 extends child2
{
	child3(){
	str=str.concat("example");
	System.out.println(data);
	}
	void display()
	{
		System.out.println(str);
	}
	
}
class multilevel
{
	public static void main(String ar[])
	{
		child3 obj=new child3();
		obj.display();
	}
}