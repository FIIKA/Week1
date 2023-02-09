package introtojava;

import java.util.Scanner; //Import the Scanner Class
public class Fibonacci_series {

	public static void main(String[] args) {
		
		int num1 = 0;
	    int num2 = 1;
	    int sum = 0;
		
	        
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
	        
	    //0,1,1,2,3,5,8,13..  
		System.out.println("Input a number: ");
		int number = myObj.nextInt();
		//System.out.println(num1);
		//System.out.println(num2);
		
		for (int i = 2; i < number; i++) {
			
			sum = num1 + num2;
			System.out.println(sum);
			
			num1 = num2;
			num2 = sum;
		}
		
		
		
	 
	  }

	}

