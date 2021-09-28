package proj1;
import java.util.Scanner;

/**
 * <p> Title: Project1: User's Name and Grade</p>
 * <p> Description: This program asks the user for their name, midterm grade and final exam grade, and outputs 
 * their name with as last name, first name. Then the program tells the user how many letters are in the first 
 * and last name as well as the total letters in their first and last name combined. Then it tells the user
 * their first and last initials and tells the user their midterm, final exam grades, as well as the
 * average of those two grades. </p>
 * @author Christoph Gaffikin
 * */

public class Project1
{
	public static void main(String[] args)
	{
		// declaration of all necessary variables
		String fullName;
		int posOfSpace;
		String firstName;
		String lastName;
		int firstNameLength;
		int lastNameLength;
		int fullNameLength;
		char firstInitial;
		char lastInitial;
		double midterm;
		double finalExam;
		double average;
		
		// set up the Scanner object for reading user input.
		Scanner scanner = new Scanner(System.in);
		
        // ask the user for their full name.
		System.out.println("Please enter your first name, followed by a space, followed by your last name:"); 
		fullName = scanner.nextLine();  
		
		// get the midterm grade from the user.
		System.out.println("Please enter your midterm grade:"); 
		midterm = scanner.nextDouble();

		// get the final exam grade from the user
		System.out.println("Please enter your final exam grade:"); 
		finalExam = scanner.nextDouble();

		// finds the index of the space within fullName of the user.
		posOfSpace = fullName.indexOf(" ");
		
		// assigns the first and last name substrings to their respective variables.
		firstName = fullName.substring(0, posOfSpace);
		lastName = fullName.substring(posOfSpace + 1);
		
		// prints to the console "Name: " followed by the lastName then the first
		// name, separated by a comma.
		System.out.println("Name: " + lastName + ", " + firstName + "\n");
		
		// assigns NameLength variables with each Name's respective lengths.
		// fullNameLength has one subtracted from it to account for the space
		// in the fullName.
		firstNameLength = firstName.length();
		lastNameLength = lastName.length();
		fullNameLength = fullName.length()-1;
		
		// prints to the console 3 sentences telling the user the number of letters
		// in each Name variable. Namely, firstName, lastName, and fullName.
		System.out.println("There are " + firstNameLength + " letters in my first name ");
		System.out.println("There are " + lastNameLength + " letters in my last name");
		System.out.println("There are " + fullNameLength + " letters in my full name\n");
		
		// assigns variables with initials of user's first and last name.
		firstInitial = fullName.charAt(0);
		lastInitial = lastName.charAt(0);
		
		// prints to console the first and last initial with text identifying each.
		System.out.println("First initial: " + firstInitial);
		System.out.println("Last initial: " + lastInitial + "\n");
		
		// takes the average of midterm and finalExam grades.
		average = (midterm + finalExam) / 2;
		
		// prints to console the midterm grade, the finalExam grade, and the users average.
		System.out.println("Midterm: " + midterm);
		System.out.println("Final Exam: " + finalExam);
		System.out.println("\nAverage: " + average);
		
		// closes the Scanner object.
		scanner.close();
	}
}
