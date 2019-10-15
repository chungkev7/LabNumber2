import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String continueInput = "";
	
		do {
		System.out.println("Enter the length of the classroom: ");
		double lengthInput = scan.nextDouble();
		
		System.out.println("Enter the width of the classroom: ");
		double widthInput = scan.nextDouble();
		
		System.out.println("Enter the height of the classroom: ");
		double heightInput = scan.nextDouble();
		
		// area is length * width, perimeter is (2*length + 2*width), volume is length*width*height
		System.out.println("The area of the room is: " + (lengthInput * widthInput));
		System.out.println("The perimeter of the room is: " + (2*lengthInput + 2*widthInput));
		System.out.println("The volume of the room is: " + (lengthInput * widthInput * heightInput));
		
		scan.nextLine();
		
		System.out.println("Would you like to continue? (y/n)");
		continueInput = scan.nextLine().toLowerCase();
		
		} while (continueInput.equals("y") || continueInput.equals("yes"));
		
		System.out.println("Calculation complete. Have a nice day!");
	}
}
