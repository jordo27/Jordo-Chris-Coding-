package cardDeck;
import java.util.Scanner;

public class Projtracing {
	public static void main(String[] args) 
	{
		String fullName;
		String someString;
		String anotherString;
		int posOfPeriod;
		int numChars;
		int posOfSpace;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your full name");
		fullName = scanner.nextLine();
		posOfPeriod = fullName.indexOf(".");
		System.out.println("Position of period " + posOfPeriod);

		someString = fullName.substring(1, posOfPeriod + 5);
		System.out.println(someString);

		numChars = fullName.length();
		anotherString = fullName.substring(posOfPeriod + 4, numChars - 3);
		System.out.println(numChars);
		System.out.println(anotherString);

		posOfSpace = anotherString.indexOf(" ");
		System.out.println("Position of space " + posOfSpace);
		System.out.println(anotherString.substring(posOfSpace - 1, anotherString.indexOf("ton")));

	}

}
