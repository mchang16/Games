/**
 * @author Alvin Guo and Michelle Chang
 * Lab 4
 * Summary: Character Creation
 */
import java.util.Scanner;
public class CharacterCreator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Ask the user character infos
		System.out.println("What is your character's gender?");
		String name = s.next();
		System.out.println("What color is your character wearing?");
		String color = s.next();
		System.out.println("How long is your character's hair?");
		int hair = s.nextInt();
		int pets = 0;
		String season = "";
		int code = 0;

		// if statements to see what will be printed
		if(name.equalsIgnoreCase("male") && color.equalsIgnoreCase("red")) {
			System.out.println("Do you prefer dogs or cats? (1 for dogs 2 for cats)");
			pets = s.nextInt();
		}

		else {
			System.out.println("Does your character prefer winter or summer?");
			season = s.next();
		}
		if(name.equalsIgnoreCase("female") || color.equalsIgnoreCase("green")) {
			System.out.println("Does your character prefer coding in Java or C++ (Enter 1 for java and 2 for C++)");
			code = s.nextInt();
		}

		System.out.println("Your character's gender is " + name);
		System.out.println("Your character is wearing an awesome " + color + " shirt");

		if(hair<5) {
			System.out.println("Your character has short hair.");
		}
		else if(hair<10) {
			System.out.println("Your character has medium hair.");
		}
		else {
			System.out.println("Your character has long hair.");
		}

		if (!(name.equalsIgnoreCase("male")) || (!(color.equalsIgnoreCase("red")))) {
			System.out.println("Your character enjoys " + season);
		}
		if (pets == 1){
			System.out.println("Your character really loves dogs");	
		}
		else if (pets == 2) {
			System.out.println("Your character really loves cats");
		}
		if (code == 1){
			System.out.println("Your character loves coding in Java");
		}
		else if(code == 2){
			System.out.println("Your character loves coding in C++");
		}
		if(color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("blue")) {
			System.out.println("Go Gators!");
		}
		s.close();
	}
}
