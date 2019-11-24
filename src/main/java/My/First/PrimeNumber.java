package My.First;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	
	
	public static void main(String[] args) {

		// Declare an integer Input and assign a value
		
		// Declare a boolean input as flag
		
		int InputNo,remainder=0;
		InputNo=13;
		//get the input
		
		boolean inputflag=false;
		System.out.println("Checking the input as prime No. or Not :::"+ InputNo);
		for(int i=2;i<=InputNo/2;i++)
		{
			remainder= InputNo%2;
							
		}
		if (remainder!=0)
		{
			inputflag= true;
			System.out.println("This is the prime No.");
		}
		else
		{
			inputflag=false;
			System.out.println("This is Not prime No.");
		}
		// Iterate from 1 to half of the input
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
			
		//Checking the prime no. from 1 to 100
		/*int i;
        int num = 0;
        int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;
 
        //Empty String
        String primeNumbersFound = "";
 
        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;*/


	}

}
