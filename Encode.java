/*
* Leoza - V00840048
* Encode.java
*
* Program Description : A program which takes user input to convert to ASCII character which 
finds the corresponding ASCII code and modifies to encrypt the original string and outputs string.
*
*/

import java.util.*;

public class Encode {

	/**
	 * Main method - this does not need to be changed at all.
	 */
	public static void main(String[] args) {
		//testing(); //comment this out after completing part 1
		userInteraction();
	}
	
	/**
	 * This method is used to test the encrypt method. 
	 */
	public static void testing() {
		//Write more code here to test the encrypt method
		//with different messages and keys once you
		//complete the algorithm in the encrypt method
		String testMessage1 = "Test";
		int testKey1 = 11;
		String result = encrypt(testMessage1, testKey1);
		System.out.println("Encrypted result: "+result);
	}
	
	/**
	 * This method changes each character in a String to a 
	 * different character based on the key passed in as
	 * an integer. The new String created by the encryption
	 * process is returned.
	 *
	 * @param message	the String to be encoded
	 * @param key		the integer value used for encryption
	 * @return			a new encoded String
	 */
	public static String encrypt(String message, int key) {
		System.out.println("encoding: "+message+", with key: "+key);
		String encodedMessage = "";
		message = message.toUpperCase();
		for (int i=0; i<message.length(); i++){
		char letter = message.charAt(i);
		int characterValue = (int) letter; //convert a character into integar
		characterValue= characterValue + key;
		if (characterValue > 90){
			characterValue = characterValue - 26;
		} 
		char l = (char) characterValue; //convert an integar into a character
		encodedMessage= encodedMessage + l;
		
		// complete this method by filling in code here.
		}
		return encodedMessage;
}
	
	/**
	 * This method tests the encrypt method using a Scanner
	 * to read in user input from the command line
	 */
	public static void userInteraction() {
		System.out.println("Print out a sentence");
			Scanner console= new Scanner (System.in);
			String theSentence = console.nextLine(); //next captures a word? nextline captures a full sentence
			//use a for loop to show the code numbers  
		System.out.println("Enter key!");
			Scanner inputKey=new Scanner(System.in);
			String key = inputKey.nextLine();
			String testMessage1 = theSentence;
			int testKey1 = Integer.parseInt(key); //analyze a string and converts into an integar
			String result = encrypt(testMessage1, testKey1);
			System.out.println("Encrypted result: "+result);
			

				
	
		
	}
	}
	
	
