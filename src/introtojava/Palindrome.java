package introtojava;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			String reverseWord = "";
  
			
			System.out.println("Enter your word: ");
			String word = input.nextLine();
			
			//Declare integer variable
			int wordLength = word.length();
			
			
			for(int i = (wordLength -1); i>=0; --i) {
				reverseWord = reverseWord + word.charAt(i);
			}
			
			if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
				System.out.println(word + " is a Palindrome String.");
			}
			else {
				System.out.println(word + " is not a Palindrome String.");
			}
			
			
	}

}