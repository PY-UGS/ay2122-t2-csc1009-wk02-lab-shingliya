public class Main
{
	public static void main(String[] args)
	{
		System.out.println("=============== Q1 ===============");
		Circle c = new Circle();
		c.SetRadius();
		c.PrintArea();
		
		System.out.println("=============== Q2 ===============");
		Average.CalAverageOfThree();
		
		System.out.println("=============== Q3 ===============");
		MyTime.GetCurTime();

		System.out.println("=============== Q4 ===============");
		Zodiac z = Zodiac.GetInstance();
		z.CalZodiacByYear(); 
	}
}