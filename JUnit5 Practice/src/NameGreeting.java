import java.util.Scanner;

public class NameGreeting
	{
	public static void main(String[] args)
		{
		//greetUser();
		//addNumbers(2, 3);
		//System.out.println(addNumbers(2, 3));
		multiplyNumbers();
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
	
	public static int multiplyNumbers()
		{
		System.out.println("What's your first integer?");
		Scanner userNumber = new Scanner(System.in);
		int firstNum = userNumber.nextInt();
		System.out.println("What's your second integer?");
		int secondNum = userNumber.nextInt();
		System.out.println(firstNum + " x " + secondNum + " = " + (firstNum *secondNum));
		return firstNum * secondNum;
		}
	}
