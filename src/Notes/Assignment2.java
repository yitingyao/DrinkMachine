package Notes;

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

	}
}