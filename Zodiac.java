import java.util.Scanner;

public class Zodiac 
{
	private static Zodiac instance = null;
	private static Scanner in;
	private static String animal[] = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
				   "rabbit", "dragon", "snake", "horse", "sheep"};
	private Zodiac()
	{
		in = new Scanner(System.in);
	}

	public static Zodiac GetInstance()
	{
		if(instance == null)
		{
			instance = new Zodiac();
		}
		return instance;
	}

	public void CalZodiacByYear()
	{
		int year;

		System.out.println("Enter a year: ");
		year = in.nextInt();
		System.out.println(animal[Math.abs(year%12)]);
	}
}