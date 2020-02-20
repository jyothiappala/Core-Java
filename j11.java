class j11
{
	int id;
	String name;
	j11(int id1,String name1)
	{
		id=id1;
		name=name1;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String ar[])
	{
		j11 j=new j11(10,"jyothi");
		j11 p=new j11(11,"priya");
		j.display();
		p.display();	
	}
}