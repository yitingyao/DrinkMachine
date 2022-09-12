package Submission;
/*
 *Student Name: Yiting Yao
 *Lab Professor: Professor Mel Sanschagrin
 *Due Date: Nov 19, 2021
 *Description: Assignment 2 (Fall 21)
 */
import java.util.Scanner;
/*
 * This class has the main method for the application
 */
public class Assignment02 {

	public static void main(String[] args) {
		DrinkMachine machine = new DrinkMachine(); // machine object created
		User user = new User(); // user object created
		do {// do while loop
			System.out.println(machine.drinkSizeMenu()); // machine object calls drinkSizeMenu object
			machine.setSize(user.inputString("Enter Size (small, medium, or large):")); // setter sets the size to user input																					// size
			machine.setVolume(user.inputDouble("Enter volume:"));//setter sets the volume to user input
			System.out.println(machine.verifySize());
			System.out.printf("Program by %s%n", "Yiting Yao");// output name using printf
		} while (user.inputString("Continue Program (yes/no):").equalsIgnoreCase("yes")); // while user input is some form of yes, loop gets executed																				
		System.out.println("Program has exited.");
	}
}