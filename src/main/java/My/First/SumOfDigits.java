package My.First;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) 
	{
	       int InputNo=123;
           int  sum=0,remainder=0,quotent=0;
           while(quotent<0)
           {
        	  remainder=InputNo%10;
        	  sum=sum+remainder;
        	  System.out.println("The Numbers are ::" + remainder);
        	  System.out.println("The Numbers are ::" + quotent);
           }
           System.out.println("The Numbers are ::" + sum + "+");
        	   // Declare your input number (inte)

		// Initialize an integer variable by name: sum

		// Use loop to calculate the sum: which loop to use until the number goes less than 10??

		// Within loop: get the remainder when done by 10 -> Tip: use mod

			// Print the remainder to confirm
	
			// Within loop: add that remainder to the sum
	
			// Print the sum to confirm
	
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
	
			// Print the quotient to confirm
		
		// Outside the loop: print the final sum
	}

}
