import java.util.*;
import java.util.LocalDate;
class DayFinder
{
	public void method(String s)
	{
		LocalDate date= LocalDate.of(s);
		DayToWeek week= DayToWeek.name();
		System.out.println(week);
	}
}
class first
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		DayFinder obj=new DayFinder();
		String str=s.nextLine();
		obj.method(str);
		
	}
}