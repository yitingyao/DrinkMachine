package Notes;

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
public class Assignment2 {

	public static void main(String[] args) {
		DrinkMachinePersonal machine = new DrinkMachinePersonal(); // machine object created
		User user = new User(); // user object created
		do {// do while loop
			System.out.println(machine.drinkSizeMenu()); // machine object calls drinkSizeMenu object
			machine.setSize(user.inputString("Enter Size (small, medium, or large):")); // setter sets the user input
																						// size

			machine.setVolume(user.inputDouble("Enter volume:"));
			System.out.println(machine.verifySize());
			System.out.printf("Program by %s%n", "Yiting Yao");// output your name using printf

		} while (user.inputString("Continue Program (yes/no):").equals("yes")); // while equals yes, loop gets executed
																				// again
		System.out.println("Program has exited.");
		// ToDo:
		// Ask for drink size as text, prompt using the menu generated
		// from a method in DrinkMachine

		// Ask for measured volume, accepting decimal places

		// determine if the volume matches the expected size using the
		// verifySize() method, printing the returned report.

		// print out your name on screen

		// ask if there is more data to enter (yes, no) and continue
		// using a loop only if the user enters some form of yes
		// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)

		// you can use any decision structure or loop for this program,
		// however a for-loop is not recommended.

	}
}