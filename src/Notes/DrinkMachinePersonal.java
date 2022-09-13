package Notes;

public class DrinkMachinePersonal {
	public static final String SMALL = "small"; // static var belongs to class, all objects of this class share static
												// variable
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	// ToDo: declare an EPSILON constant with value of 10.0
	// i.e. is measured volume within 10ml of expected volume?
	public static final double EPSILON = 10.0; // becomes slanted when constant
	private double volume; // (ml)
	private String size; // "small", "medium", "large"

	public DrinkMachinePersonal() { // constructor
		this(DrinkMachinePersonal.MEDIUM_VOLUME, DrinkMachinePersonal.MEDIUM);
	} // sets the default value, this.volume = medium_volume

	public DrinkMachinePersonal(double volume, String size) {// getting the arguments, setting to instance variables
		this.volume = volume;
		this.size = size;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String getSize() {
		return size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public void setSize(String size) {
		this.size = size;
	}

	public String verifySize() {
		String report = ""; // initializing report
		double difference = 0;

		String message = ""; // initializing message
		if (volume < 0) { // beginning of another if statement, to check if volume is valid
			message = "invalid size or volume input";
		} else if (size.equals(DrinkMachinePersonal.SMALL)) { // checks if strings are the same includes case sensitivity
			difference = Math.abs(DrinkMachinePersonal.SMALL_VOLUME - volume);
		} else if (size.equals(DrinkMachinePersonal.MEDIUM)) {
			difference = Math.abs(DrinkMachinePersonal.MEDIUM_VOLUME - volume);
		} else if (size.equals(DrinkMachinePersonal.LARGE)) {
			difference = Math.abs(DrinkMachinePersonal.LARGE_VOLUME - volume);
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

	public String drinkSizeMenu() {
		String report = String.format(
				"Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)%ndrink sizes are case-sensitive",
				DrinkMachinePersonal.SMALL, DrinkMachinePersonal.SMALL_VOLUME, DrinkMachinePersonal.MEDIUM,
				DrinkMachinePersonal.MEDIUM_VOLUME, DrinkMachinePersonal.LARGE, DrinkMachinePersonal.LARGE_VOLUME);

		return report;
	}
}
