import java.time.*;
import java.time.temporal.ChronoUnit;
public class LocalTimeEx
{
	public static void main(String[]ar)
	{
		ZoneId zone1=ZoneId.of("Asia/Tokyo");
		ZoneId zone2=ZoneId.of("kolkata");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("India time zone:"+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("time zone:"+time2);
		long hours=ChronoUnit.HOURS.between(time1,time2);
		System.out.println("Hours between two time Zone:"+hours);
		long minutes=ChronoUnit.MINUTES.between(time1,time2);
		System.out.println("Minutes between two time zone: "+minutes);
	}
}