class personal
{
	public final String getName()
	{
		return "personal loan";
	}
}
class home extends personal
{
	public final String getName()
	{
		return "home loan";
	}
}
class Final1
{
	public static void main(String ar[])
	{
		home obj=new home();
		obj.getName();	
	}
}