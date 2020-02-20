class argcons
{
	argcons1 obj,obj1,obj2;
	argcons(argcons1 obj,argcons1 obj1,argcons1 obj2)
	{
		this.obj=obj;
		this.obj1=obj1;
		this.obj2=obj2;
	}
	void display(){
	System.out.println(obj.data1);
	System.out.println(obj1.data);
	System.out.println(obj2.data1);}
}
class argcons1
{
	int data=10,data1=11;
	
	argcons1()
	{
		argcons b=new argcons(this,this,this);
		b.display();
	}
	public static void main(String ar[])
	{
		argcons1 a=new argcons1();
	}
}