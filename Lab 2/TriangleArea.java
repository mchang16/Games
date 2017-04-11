import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter triangle base: ");
		int base = scan.nextInt();

		System.out.print("Enter triangle height: ");
		int height = scan.nextInt();

		double x = base * height * .5;

		System.out.println("Area of this triangle is: " + x);

	}
}
