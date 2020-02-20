class parent1
{}
class child1 extends parent1{}
class child2 extends parent1{}
class instacedeme
{
	public static void main(String[]ar)
	{
		parent1 p=new parent1();
		child1 c1=new child1();
		child2 c2=new child2();
		System.out.println(c1 instanceof parent1);
		System.out.println(c2 instanceof parent1);
		System.out.println(p instanceof child1);
		System.out.println(p instanceof child2);
		p=c1;
		System.out.println(p instanceof child1);
		System.out.println(p instanceof child2);
		p=c2;
		System.out.println(p instanceof child1);
		System.out.println(p instanceof child2);
	}
}