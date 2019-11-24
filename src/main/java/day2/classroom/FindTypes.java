package day2.classroom;

public class FindTypes {


	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		
		char[] charray= test.toCharArray();
        
        int len =test.length();
        
        
       // b) Traverse through each character (using loop in reverse direction)
       for(int i=len-1; i>=0; i--)
       {
       	//System.out.print(charray[i]);
       	if (Character.isLetter(charray[i]))
       		
       	
       	   letter=letter +1;
       	  // System.out.print(letter);
       
       else if(Character.isSpaceChar(charray[i]))
       {
    	   space =space +1;
    	 //  System.out.print(letter);
       }
       else if(Character.isDigit(charray[i] ))
       {
    	   num=num+1;
    	   //System.out.print(num);
       }
       else
    		   specialChar=specialChar +1;
       }
       
         //System.out.println();
	
		
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
	
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: "+ specialChar );
	}

}
