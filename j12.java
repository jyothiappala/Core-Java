class j12
{
	int id;
	String name;
	int age;
	j12(int i,String n){
	id=i;
	name=n;}
	j12(int i,String n,int a){
	id=i;
	name=n;
	age=a;}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String ar[])
	{
		j12 j=new j12(10,"jyothi");
		j12 p=new j12(11,"priya",9);
		j.display();
		p.display();	
	}
}