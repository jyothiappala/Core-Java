import java.time.*;
public class MonthDemo
{
	public static void main(String[] ar)
	{
		MonthDay month=MonthDay.now();
		boolean b=month.isValidYear(9876);
		System.out.println(b);
	}
}