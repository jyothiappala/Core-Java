class stat
{
	int id;
	String name;
	int age;
	static String college="SRM";
	stat(int i,String n){
	id=i;
	name=n;}
	void display()
	{
		System.out.println(id+" "+name+" "+age+college);
	}
}
public class j13
{
	public static void main(String ar[])
	{
		stat j=new stat(10,"jyothi");
		stat p=new stat(11,"priya");
		j.display();
		p.display();	
	}
}