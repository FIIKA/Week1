package introtojava;


import java.util.Scanner;
public class Strings_lenght {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Declare String Variables
		String reverse = ""; 
		
		System.out.println("Enter your word: ");
		String word = input.nextLine();
		
		System.out.println("The length of the text string is: " + word.length());

		return;
	}

}
