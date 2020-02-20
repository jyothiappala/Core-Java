import java.util.*;
class book
{
	int id;
	String name,author,publisher;
	int quantity;
	public book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArrayListDemo1
{
	public static void main(String ar[])
	{
		List<book> list=new ArrayList<book>();
		book b1=new book(101,"jyothi","nothing","nothing",100);
		book b2=new book(101,"jyothi","nothing","nothing",100);
		book b3=new book(101,"jyothi","nothing","nothing",100);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(book b:list)
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	
}