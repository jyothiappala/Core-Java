class stat
{
	int id;
	String name;
	int age;
	static String college="SRM";
	static void change(){
	college="srm";}
	stat(int r,String n){
	id=r;
	name=n;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
}
public class j14
{
	public static void main(String ar[])
	{
		stat.change();
		stat j=new stat(10,"jyothi");
		stat p=new stat(11,"priya");
		j.display();
		p.display();	
	}
}