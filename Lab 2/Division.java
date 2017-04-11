import java.util.Scanner;

public class Division {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int firstNumber = scan.nextInt();

		System.out.println("Enter Second Number");
		int secondNumber = scan.nextInt();

		int x = firstNumber / secondNumber;
		int y = firstNumber % secondNumber;

		System.out
				.println("The Quotient is " + x + " with a Remainder of " + y);

	}
}