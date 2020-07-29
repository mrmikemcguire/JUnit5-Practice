import java.util.Scanner;

public class NameGreeting
	{
	public static void main(String[] args)
		{
		//greetUser();
		//addNumbers(2, 3);
		System.out.println(addNumbers(2, 3));
		}
	
	public static void greetUser()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + "!");
		}
	
	public static int addNumbers(int x, int y)
		{
		System.out.println(x + " + " + y + " = " + (x + y));
		return (x + y + 1);
		}
	}
