import java.util.Scanner;

public class roomDetailGenerator {

	public static void main(String[] args) {

		double length = 0;
		double width = 0;
		double height = 0;
		double area = 0;
		double perimeter = 0;
		double volume = 0;
		

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		System.out.println("Enter Length: ");

		// add scanner object to accept user input
		Scanner scan = new Scanner(System.in);
		length = scan.nextDouble();

		System.out.println("Enter Width: ");
		width = scan.nextDouble();
		
		System.out.println("Enter Height: ");
		height = scan.nextDouble();
		
		// calculations for area, perimeter, and volume
		area = length * width;
		perimeter = 2 * (length + width);
		volume = length * width * height;

		// display values for area, perimeter, and volume
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume);
		System.out.println();

		
		// Prompt user to indicate if they want to continue
		System.out.println("Continue? (y/n): ");
		
		// Read user response
		char userResponse;
		userResponse = scan.next().charAt(0);

		// Repeat program as long as user selects 'y'
		while (userResponse == 'y') {
			System.out.println();
			System.out.println("Enter Length: ");
			length = scan.nextDouble();
			System.out.println("Enter Width: ");
			width = scan.nextDouble();
			System.out.println("Enter Height: ");
			height = scan.nextDouble();
			

			area = length * width;
			perimeter = 2 * (length + width);
			volume = length * width * height;


			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			System.out.println();
			
			System.out.println("Continue? (y/n): ");
			userResponse = scan.next().charAt(0);

		}
		scan.close();
		System.out.println();
		System.out.println("Thank you for using Grand Circus' Room Detail Generator! Goodbye.");
	}
	
	}

