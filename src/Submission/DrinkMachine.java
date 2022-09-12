package Submission;
/*
 *Student Name: Yiting Yao
 *Lab Professor: Professor Mel Sanschagrin
 *Due Date: Nov 19, 2021
 *Description: Assignment 2 (Fall 21)
 */
public class DrinkMachine {
	public static final String SMALL = "small"; 
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;//(mL)
	public static final double MEDIUM_VOLUME = 400.0;//(mL)
	public static final double LARGE_VOLUME = 500.0;//(mL)
	public static final double EPSILON = 10.0; // tolerance of 10 mL
	private double volume; // (mL)
	private String size; // small, medium, or large

	
	public DrinkMachine() { // no args constructor
		this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM); //the default size is medium volume, and medium size
	} // sets the default value, this.volume = medium_volume

	// setting the default values of volume and size
	public DrinkMachine(double volume, String size) {// getting the arguments, setting to instance variables
		this.volume = volume;
		this.size = size;
	}

	// getter for volume
	public double getVolume() {
		return volume;
	}

	// setter for volume
	public void setVolume(double volume) {
		this.volume = volume;
	}

	// getter for size
	public String getSize() {
		return size;
	}

	// setter for size
	public void setSize(String size) {
		this.size = size;
	}
	
	public String verifySize() {//method to verify size, takes user input and compares to valid answers
		String report = ""; // initializing report
		double difference = 0; //initializing difference
		String message = ""; // initializing message
		if (volume < 0 ) { // beginning of another if statement, to check if volume is valid
			message = "invalid size or volume input";
		} else if (size.equals(DrinkMachine.SMALL)) { // checks if strings are the same, includes case sensitivity
			difference = Math.abs(DrinkMachine.SMALL_VOLUME - volume);
		} else if (size.equals(DrinkMachine.MEDIUM)) {
			difference = Math.abs(DrinkMachine.MEDIUM_VOLUME - volume);
		} else if (size.equals(DrinkMachine.LARGE)) {
			difference = Math.abs(DrinkMachine.LARGE_VOLUME - volume);
		} else {
			message = "invalid size or volume input";
		}
		if (message.equals("")) { // if volume & size is valid , message should be an empty string
			if (difference <= EPSILON) {
				message = "within tolerance of 10.0 ml";
			} else {
				message = "outside of tolerance of 10.0 ml";
			}
		}
		report = String.format("size is %s, volume is %.1f ml, difference is %.1f ml, %s", size, volume, difference,
				message);
		return report;
	}
	public String drinkSizeMenu() {//outputs the drink size menu
		String report = String.format(
				"Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)%ndrink sizes are case-sensitive",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME, DrinkMachine.MEDIUM, DrinkMachine.MEDIUM_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME);
		return report;
	}
}
