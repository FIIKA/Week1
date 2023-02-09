package introtojava;

//Big Coding Friday 1.1 


import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
		
			double number1, number2, result; // Double data types for decimal numbers
			
			
				System.out.println(".......Calculator Menu.......");
			
				
					
				//Ask user to Press a number from 1 to 7
				System.out.println("\nPress 1 for Addition");
				System.out.println("Press 2 for Subtraction");
				System.out.println("Press 3 for Multiplication");
				System.out.println("Press 4 for Division");
				System.out.println("Press 5 for Finding Square");
				System.out.println("Press 6 for Finding Square Root");
				System.out.println("Press 7 for Finding Reciprocal");
				
				int press = input.nextInt();
				
				switch(press) {
				 
				//If press '1'
				case 1:  
					System.out.println("Enter first addition number");
					number1 = input.nextDouble();
					
					System.out.println("Enter second addition number");
					number2 = input.nextDouble();
					
					result = number1 + number2;
					System.out.println(number1 + "+" + number2 + "=" + result);
					break;
					
					
					
				//If press '2'
				case 2:  
					System.out.println("Enter first substraction number");
					number1 = input.nextDouble();
					
					System.out.println("Enter second subtraction number");
					number2 = input.nextDouble();
					
					result = number1 - number2;
					System.out.println(number1 + "-" + number2 + "=" + result);
					break;
					
					
					
					//If press '3'
				case 3:  
					System.out.println("Enter first multiplication number");
					number1 = input.nextDouble();
					
					System.out.println("Enter second multiplication number");
					number2 = input.nextDouble();
					
					result = number1 * number2;
					System.out.println(number1 + "*" + number2 + "=" + result);
					break;
					
					
					
					//If press '4'
				case 4:  
					System.out.println("Enter first division number");
					number1 = input.nextDouble();
					
					System.out.println("Enter second division number");
					number2 = input.nextDouble();
					
					result = number1 - number2;
					System.out.println(number1 + "/" + number2 + "=" + result);
					break;
					
					
					
					//If press '5'
				case 5:  
					System.out.println("Enter the number");
					number1 = input.nextDouble();
					
					result = number1 * number1;
					System.out.println("The squared number = " + result);
					break;
					
				
					
					///If press '6'
				case 6:  
					System.out.println("Enter the number");
					number1 = input.nextDouble();
					
					result = (int) Math.sqrt(number1);
					System.out.println("The squared root number = " + result);
					break;
					
					
					///If press '7'
				case 7:  
					System.out.println("Enter the number");
					number1 = input.nextDouble();
					
					result = (int) Math.sqrt(number1);
					System.out.println("The squared root number = " + result);
					break;
					
													
	}
	
  } 
	
}