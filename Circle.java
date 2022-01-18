import java.util.Scanner;

public class Circle
{
	private double radius;
	private Scanner input;

	public Circle()
	{
		radius = 1;
		input = new Scanner(System.in);
	}

	public void SetRadius()
	{
		System.out.print("Enter a number for radius: ");
		radius = input.nextDouble();
	}

	public void PrintArea()
	{
		System.out.println("The area for the circle of radius " + radius + " is " + (radius * radius * 3.14159));
	}
}