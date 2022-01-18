import java.util.Scanner;

public class Average
{
	private Average()
	{};
	public static void CalAverageOfThree()
	{
		double a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		System.out.println("The average of " + a + " " + b + " " + c + " is " + ((a+b+c)/3) );
	}
}