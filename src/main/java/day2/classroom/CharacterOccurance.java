package day2.classroom;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 't';
		int totalCount = 0;
		
		
		char[] charray= test.toCharArray();
        
        int len =test.length();
 
      
       for(int i=len-1; i>=0; i--)
       {
    	if(charray[i]==ch)
    	{
    		
    		System.out.print(charray[i]);
    		totalCount=totalCount +1;
    	}
       }
     //System.out.println();
		
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/

		
		
		
		
		
		
		
		
		
		// Print the count here
		System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}
