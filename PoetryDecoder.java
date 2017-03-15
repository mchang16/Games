//Do not edit this imports 
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;

/**
 * STUDENTS FILL IN PROPER DOCUMENTATION HERE
 * 
 * @author Michelle Chang 
 * COP 3502 Section Number: 6736
 * 
 */

public class PoetryDecoder {
	/**
	 * This main method asks the user to enter input. Then, it calls the decode
	 * method on that input. STUDENTS: DO NOT EDIT this main method. Do all of
	 * your work in the methods below it. Note: This is the only method that has
	 * System.out output. No other method prints to the console! (You may of
	 * course print to console for your own debugging purposes, but remove that
	 * debug code before you submit your program.)
	 * 
	 * @param args
	 *            This main method does not take command line args.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// This prompt to the user is intentionally vague to avoid
		// incrimating those who use this program.
		System.out.println("Please enter your input: ");
		String hex = sc.nextLine();
	
		// STUDENTS: Your decode method must return a fully formatted String,
		// which will be output here.
		System.out.print(decode(hex));

		sc.close();

	}

	/**
	 * The decode method STUDENTS: This decode method is where all your work
	 * happens. To keep it clean and simple, it calls other methods.
	 * 
	 * @param hex
	 *            The string of hex digits that is to be decoded.
	 * @return A String representing an entire decoded poem of English words.
	 *         (The returned string includes line breaks and spacing.)
	 */

	public static String decode(String hex) {
		
		if(toEnglishLetters(hex)==""){
		    return "";
		}
		// STUDENTS: First, translate the hex string into English characters.
		// Use the toEnglishCharacters() method to do that.
		// STUDENTS: Now that you have the String of English characters,
		// search it to extract all four-letter words and store those in one
		// array.
		// Search it again to extract all five-letter words and store in a
		// different array.
		// Search it one final time to extract all six-letter words and store
		// in a different array.
		// To do this, call your findWordsOfLength() method three times with
		// the appropriate parameters.
		// STUDENTS: delete this return statement and replace it with your own.
		// It's just a placeholder so that your method can compile.
		

	
		
			return formatPoem(findWordsOfLength(toEnglishLetters(hex), 4),findWordsOfLength(toEnglishLetters(hex), 5),findWordsOfLength(toEnglishLetters(hex), 6));

	}

	/**
	 * STUDENTS: You must write this method. Fill in its body. But do not change
	 * its header!
	 * 
	 * This method takes a String of hex characters and, chunking them two at a
	 * time, finds a corresponding English letter according to the ASCII table.
	 * If the String of hex characters is of odd length, the final hex character
	 * is IGNORED. * Note that the pairs of hex characters may not precisely
	 * correspond to ASCII letter values-- that would be too easy to track!
	 * Instead, you must translate the hex pair into an ASCII English letter (no
	 * punctuation or digits) using character arithmetic. More details on that:
	 * * To translate any pair of hex digits to English letters, here is the
	 * procedure: Take every two hex digits and convert it to its decimal form.
	 * If this number is inside the ASCII range for an English letter, either
	 * lower case or upper case, then you're done converting to a letter. If it
	 * is not inside the ASCII range for letters, mod the value by 26 and map it
	 * to an ASCII letter based on the result. mod 0='a'; mod 1 = 'b'; mod 2='c'
	 * and so on. You do not need a big switch statement or if's. Just use
	 * character arithmetic. *
	 * 
	 * @param String
	 *            hex: String of hex characters. If the String is of odd length,
	 *            the final hex character is ignored and not translated. *
	 * @return String: the String of English letters. Each letter came from a
	 *         pair of hex digits in the original input String.
	 */

	public static String toEnglishLetters(String hex) {
		
		

		if (!(hex.length() % 2 == 0)) { // if hexadecimal is of an odd number, delete it to make it even
										
			hex = hex.substring(0, hex.length() - 1);

		}

		String toString = "";
		String modToString = "";
		String megaString = "";

		for (int i = 0; i < hex.length(); i += 2) {

			String inChunks = hex.substring(i, i + 2); // "sliding window"
			int toDecimal = Integer.parseInt(inChunks, 16); // hexadecimal to decimal values
															

			if (((!(toDecimal >= 97)) || (!(toDecimal <= 122))) && ((!(toDecimal >= 65)) || (!(toDecimal <= 90)))) {

				int modNumber = (toDecimal % 26) + 97;       // Modded String calculation
														
				char modToChar = (char) modNumber;           // decimal to character
				modToString = Character.toString(modToChar); // character to String
																
				megaString += modToString;

			}

			else if (toDecimal >= 97 && toDecimal <= 122) {// Unmodded String
				char toChar = (char) toDecimal;            // decimal to character
				toString = Character.toString(toChar);     // character to String
				megaString += toString;
			}
		}
		return megaString;

	}

	/**
	 * STUDENTS: Complete this method. Do NOT change its header. This method
	 * searches an input String of English letters, and returns all words of the
	 * specified length that occur in the String. A "sliding window" will be
	 * considered, so a given character could occur in more than one word that
	 * is found. This is desirable. * The size of the array you return depends
	 * on the size of the string
	 * 
	 * passed and the word size to be found. The array must be able to hold the
	 * maximum number of words of the size wordSize that could potentially be
	 * found in the input string. You do not have to first check how many real
	 * words there are. Instead, just compute how many words there *could* be.
	 * For example, a letter string of length 15 could have 13 possible
	 * three-letter words (think of a sliding window). As another example, a
	 * letter string of size 100 could have 97 possible four-letter words. Make
	 * a simple arithmetic expression to decide the size of your array at the
	 * beginning of this method. * DO NOT make the array hold a random or just
	 * very large number of words: so, do not set the array to a large number
	 * like 500. You will lose points if you do this. * Also, you must fill up
	 * the array in the order that you encounter valid words of that length. So
	 * the first word found goes to index 0, second word goes to index 1, etc.
	 * The array does not need to be completely filled up, it just need to store
	 * all the words found. Thus the remaining elements of the array must be
	 * null. * For example, if you created an array of size 97 and you only
	 * found five valid words to store in it, you would have index 0, 1, 2, 3,
	 * and 4 filled up with valid words, and indices 5 through 96 would be null.
	 * * @param String letters: A string of English letters * @param String
	 * wordSize: The size of words to be extracted from the input String
	 * 
	 * @return String[]: Contains a word in each element. Elements can be null
	 *         if no words are found.
	 */

	public static String[] findWordsOfLength(String letters, int wordSize) {
		

		int arraySize = letters.length() - (wordSize - 1); // creates variable for array size
															
		int counter = 0;

		String[] megaArray = new String[arraySize];

		if (wordSize > letters.length()) { // return nothing if wordSize is larger than the length of letters
											
			return null;
		}

		for (int i = 0; i < megaArray.length; i++) {
			String window = letters.substring(i, i + wordSize); // "sliding window"

			if (isWord(window)) {                            // if there is a word, put it at new position
				megaArray[counter] = window;

				counter += 1;

			}

		}
		return megaArray;

	}
	/**
	 * This method formats a poem according to Poetry Movement specifications.
	 * 
	 * @param Takes
	 *            three arrays of Strings of shortest, medium, and longest
	 *            lengths.
	 * @return Returns a String with line breaks and tabs as needed for poetic
	 *         formatting.
	 */

	public static String formatPoem(String[] shortest, String[] medium,
			String[] longest) {

		if(longest.length == 0){
			return null;
			
		}

		String megaString = "";             //Recieved help from TA Kristine on getting longest array

		int lengthS = shortest.length;
		int lengthM = medium.length;
		int lengthL = longest.length;

		int bigger1st = Math.max(lengthS, lengthM); // Compares larger of two array lengths
													
		int biggest = Math.max(bigger1st, lengthL); // Gives largest array length
													

		for (int i = 0; i < biggest; i++) {

			for (int j = 0; j < i; j++) { // Creates each tab
				megaString += "\t";

			}

			
			
			if(longest.length == 0){
				
				return null;
			}
					if(longest.length != 0){
			if ((i) < longest.length) { // Adds it to String if less than the length of longest array
				 
				if(longest[i] != null){	
					
					if ((i+1) == biggest-1){
                		megaString += longest[i];
                		
                	}	
                	
                	else
                	megaString += longest[i] + " ";

			

			}
			}
					}
			
			if ((i) < medium.length) { // Adds it to the String if less than the length of medium array
			
			
                if(medium[i] != null){
                	if ((i+1) == biggest-1){
                		megaString += medium[i];
                		
                	}	
                	
                	else
                	megaString += medium[i] + " ";

			}
			}
			if ((i) < shortest.length) { // Adds it to the String if less than the length of shortest array
			     
				if(shortest[i] != null){									
												

				megaString += shortest[i] ;
			}
			}
			megaString += "\n"; // Creates new line
		}

		return megaString;

	}

	// STUDENTS: delete this return statement and replace it with your own.
	// It's just a placeholder so that your method can compile.

	/*
	 * ******************************************************************************
	 * STUDENTS -- BELOW THIS POINT ARE METHODS PROVIDED FOR YOU. DO NOT EDIT
	 * THEM. USE THEM AS INDICATED IN THEIR DESCRIPTIONS.
	 * ************************
	 * ******************************************************* / /**
	 * 
	 * This method checks whether the given String occurs in a dictionary of
	 * English. STUDENTS: DO NOT MODIFY THIS METHOD IN ANY WAY. IT IS PROVIDED
	 * FOR YOU. This method will terminate your program if it is unable to
	 * access the remote URL. You must be online for this code to work. * @param
	 * possWord The word to be checked. * @return boolean Returns true if the
	 * word given is an English word, false otherwise.
	 */

	private static boolean isWord(String possWord) {
		boolean isWord = true;
		try {
			// connect to the URL.
			String s = getUrl(possWord);
			Document d = Jsoup.connect(s).timeout(6000).get();
			Elements tdTags = d.select("h3");

			// Loop over all tdTags, in this case: the h3 tag

			for (Element element : tdTags) {
				String check = element.toString();
				// Wordnet has a special h3 tag that appears only if the
				// word is not in the dictionary
				// We search for this tag. If it is found, then the word
				// searched is not in the dictionary

				if (check
						.equals("<h3>Your search did not return any results.</h3>")) {
					isWord = false;
				}
			}
		}

		catch (IOException e) {
			System.err
					.print("CHECK INTERNET CONNECTION. Could not connect to jsoup URL.");
			System.exit(0);
		}

		return isWord;
	}

	/**
	 * This is a helper method that the teaching staff code uses. STUDENTS: DO
	 * NOT EDIT THIS METHOD. This method will terminate your program if it is
	 * unable to access the remote URL. You must be online for this code to
	 * work.
	 * 
	 * @param String
	 *            : search
	 * @return A string containing the URL for the wordnet search.
	 */

	private static String getUrl(String search) {
		// Standard URL for wordnet to search
		String url = "http://wordnetweb.princeton.edu/perl/webwn?s=";
		String newURL = null;

		try {
			// Get new page from word wordnet and get its location
			Document doc = Jsoup.connect(url + search).timeout(6000).get();
			newURL = doc.location().toString();
		}

		catch (IOException e) {
			System.err
					.print("CHECK INTERNET CONNECTION. Could not connect to jsoup URL.");
			System.exit(0);
		}

		// Return the string of the new URL. return (newURL);
		return (newURL);
	}
}
