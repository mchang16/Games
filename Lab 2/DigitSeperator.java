import java.util.Scanner;

public class DigitSeperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your 4-digit Number: ");
		int num = input.nextInt();

		int firstNum = num / 1000;
		System.out.println("The first digit is : " + firstNum);

		int secNum = (num - (firstNum * 1000)) / 100;
		System.out.println("The second digit is : " + secNum);

		int thirdNum = (num - (firstNum * 1000) - (secNum * 100)) / 10;
		System.out.println("The third digit is : " + thirdNum);

		int fourthNum = (num - (firstNum * 1000) - (secNum * 100) - (thirdNum * 10));
		System.out.println("The fourth digit is : " + fourthNum);
	}

}