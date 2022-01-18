public class MyTime
{
	private MyTime()
	{};
	
	public static void GetCurTime()
	{
		long totalMilliseconds, totalSeconds,
		     totalMinutes, totalHours;
		
		totalMilliseconds = System.currentTimeMillis();
		totalSeconds = totalMilliseconds / 1000;
		totalMinutes = totalSeconds / 60;
		totalHours = totalMinutes / 60;
		
		System.out.println("Current time is " + totalHours%24 + ":" + totalMinutes%60 + ":" + totalSeconds%60 + " GMT");
	}
}