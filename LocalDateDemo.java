import java.time.LocalDate;
public class LocalDateDemo
{
	public static void main(String[]ar)
	{
		LocalDate date=LocalDate.now();
		LocalDate yes=date.minusDays(1);
		LocalDate tom=yes.plusDays(2);
		System.out.println("Today: "+date);
		System.out.println("yesturday: "+yes);
		System.out.println("Tommorow: "+tom);
	}
}