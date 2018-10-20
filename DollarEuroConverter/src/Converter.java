import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		getUserInput();
	}

	public static void getUserInput() {
		// Initialize Scanner
		Scanner myScanner = new Scanner(System.in);
		String answer = "";
		do {
			// get User Input with Scanner
			try {
				System.out.println("Um Euro in Dollar umzurechnen geben sie 1 ein für Dollar in Euro geben sie 2 ein");
				int inputType = myScanner.nextInt();
				System.out.println("Geben sie den Betrag ein den sie umwandeln wollen");
				double input = myScanner.nextDouble();
				// process the user input and print the answers
				if (inputType == 1) {
					System.out.println(input + " Euro sind " + convert(input, 1) + " Dollar");
				} else if (inputType == 2) {
					System.out.println(input + "Dollar sind" + convert(input, 2) + "Euro");
				} else {
					System.out.println(
							"Ungueltige Eingabe, bitte geben sie 1 fuer Dollar zu Euro oder 2 fuer Euro zu Dollar ein");
				}

				// In case the user enters something other than a number print error message
			} catch (java.util.InputMismatchException error) {
				System.out.println("Ungültige Eingabe");
				// Clear Scanner
				if (myScanner.hasNext()) {
					myScanner.nextLine();
				}
				continue;
			}

			// Ask if the user wants to use the converter again
			do {
				System.out.println("Wollen sie eine weitere Umrechnung durchfuehren? j/n");
				answer = myScanner.next();
				// Repeat the prompt until a valid answer is entered
			} while (!(answer.contains("n") || answer.contains("N") || answer.contains("j") || answer.contains("J")));
			// If the answer is no stop the loop
		} while (!(answer.contains("n") || answer.contains("N")));

		myScanner.close();
	}

	public static double convert(double input, int inputType) {
		// Print a message and (if the first input is one of the two valid values) the
		// converted Value
		switch (inputType) {
		case 1:
			return input * 1.34;
		case 2:
			return input / 1.34;
		}
		// avoid compilation problem
		return 0;
	}

}
