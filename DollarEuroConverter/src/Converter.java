import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		getUserInput();
	}
	public static void getUserInput(){
		//Initialize Scanner
		Scanner myScanner = new Scanner(System.in);
		String answer;
		do{
			//get User Input with Scanner
			int inputType = 0;
			double input = 0;
			try{
				System.out.println("Um Euro in Dollar zu konvertieren geben sie 0 ein für Dollar in Euro 1");
				inputType = myScanner.nextInt();
				System.out.println("Geben sie den Betrag ein den sie konvertieren wollen");
				input = myScanner.nextDouble();
				//process the user input and print the answers
				processUserInput(input, inputType);
			}catch(java.util.InputMismatchException error){
				System.out.println("Invalid input type");
			}
			
			
			//Ask if the user wants to use the converter again
			do{
				System.out.println("Wollen sie eine weitere Umrechnung durchfuehren? j/n");
				answer = myScanner.next();
			//Repeat the prompt until a valid answer is entered
			}while(!(answer.contains("n") || answer.contains("N") || answer.contains("j") || answer.contains("J")));
		//If the answer is no stop the loop
		}while(!(answer.contains("n") || answer.contains("N")));
		
		myScanner.close();
	}
	public static void processUserInput(double input, int inputType){
		//Print a message and (if the first input is one of the two valid values) the converted Value 
		switch(inputType){
		case 0: System.out.println(input + " Euro sind " + input*1.34 + " Dollar");
		break;
		case 1: System.out.println(input + " Dollar sind " + input/1.34 + "Euro");
		break;
		//If the first input is not one of the two prompted inputs print a error message
		default: System.out.println("Geben sie 0 oder 1 für die Währung ein");
		}
	}

}
