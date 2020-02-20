class stat
{
	int id=10;
	String name="akhi";
	int age=40;
	System.out.println(id+" "+name+" "+age);
	static String college="SRM";
	stat(int id,String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
}
public class A
{
	public static void main(String ar[])
	{
		stat j=new stat(10,"jyothi",20);
		stat p=new stat(11,"priya",30);
		j.display();
		p.display();	
	}
}