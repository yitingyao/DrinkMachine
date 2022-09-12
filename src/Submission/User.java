package Submission;
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

	public int inputInteger() {//method that takes the integer value from user input
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	public int inputInteger(String message) {// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger();
		return value;
	}

	//This method takes the double value from user input
	public double inputDouble() {//checks if it meets the double standards, if it is return the value, if it isn't make you input a new number
		boolean isInputBad = true;
		boolean hasNextDouble;//doesn't need to be initialized
		double value = 0.0;
		while(isInputBad) {//set while loop to true, continues to run until double inputted
			hasNextDouble = keyboard.hasNextDouble(); //hasnext is method Java made for scanners, asks if there's a double in buffer keyboard, the method retuns true or false, stores into hasNextDouble
			if(hasNextDouble) { // if hasNextDouble = true
				value = keyboard.nextDouble();
				isInputBad = false; // break out of loop once gets a double value
			}
			else {// if hasNextDouble false
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}

	public double inputDouble(String message) {//This method calls inputDouble()
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}

	public String inputString() {// This method takes the string value from user input
		String value = keyboard.nextLine();
		return value;
	}

	public String inputString(String message) {//This method prints the message parameter and calls inputString()
		System.out.printf("%s", message); // prints out the argument
		String value = inputString();
		return value; // returns the user input back to user.inputString(""),
	}
}
