package Notes;

/*
 *Student Name: Yiting Yao
 *Lab Professor: Professor Mel Sanschagrin
 *Due Date: Nov 19, 2021
 *Description: Assignment 2 (Fall 21)
 */
import java.util.Scanner;

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class User {

	private Scanner keyboard = new Scanner(System.in);

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public int inputInteger() {
		// ToDo: See lecture notes and stop this from crashing the program
		// if the user enters text, you can copy and paste code from
		// the lecture notes, but cite the lecture handout.
		int value = keyboard.nextInt();// takes value inputed
		keyboard.nextLine();// clears the buffer
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger();
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double inputDouble() {
		// ToDo: See lecture notes and stop this from crashing the program
		// if the user enters text, you can copy and paste code from
		// the lecture notes, but cite the lecture handout.
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String inputString() {// this method takes user input
		String value = keyboard.nextLine();// grabs the user input for size
		return value; // assigns user input to value and sends to line 55 replaces inputString()
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String inputString(String message) {// completely different methods, method overload
		System.out.printf("%s", message); // prints out the argument
		String value = inputString();// calls method on line 47, save the value from called method to heyyy
		return value; // returns the user input back to user.inputString(""),
	}

}
