package day2.classroom;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		//a) Convert the String to character array
        char[] charray= test.toCharArray();
                 
         int len =test.length();
         
         
        // b) Traverse through each character (using loop in reverse direction)
        for(int i=len-1; i>=0; i--)
        {
        	System.out.print(charray[i]);
        	//System.out.println(charray[i]);
        }
      System.out.println();
        for(int i=len-1; i>=0; i--)
        {
        	System.out.print(test.charAt(i));
        	
        }
        //we are taking to character
        /*for(char eachword :charray)
        {
           System.out.println(eachword);
        	//test.charAt(index)
        }*?
        
       // c) Print the c
        //	aracter (without newline -> like below
 		//	   System.out.print(ch);
 		
        
        //System.out.println("Hii");
		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		

		
		
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the ; using its index
		*/
		
		
		
		
		
		
		
		
		
	}

}
