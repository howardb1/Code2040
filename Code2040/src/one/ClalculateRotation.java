/**
 * @author brianhoward
 */
package one;
 


public class ClalculateRotation {

	
	public static int shiftedDiff(String first, String second) {
	    int rotationAmount = 0; // initializing the value of rotationAmount to 0
	    
	      if (first.length() != second.length()) { //Checking if the lengths of a and b are equal. If they aren't then they cannot be rotations of each other
	        return -1;
	      }
	    
	    
	    
	    
	      if (first.compareTo(second) == 0) { // if a and b are equal then we know we don't have to do any rotations 
	        return 0; // function can return 0 which is the final answer
	      }
	    
	   
	      int i = 1; // counter to help us determine how many times the loop runs
	      while (first.compareTo(second) != 0 && i < first.length()) { // running loop as long as a does not equal to b
	      
	        second = second.substring(1) + second.substring(0,1); // rotating string b by one and saving to b
	      // b = 
	      // b.substring(1) = 
	      // b.substring(0,1) = 
	      // b.substring(1) + b.substring(0,1) = 
	      
	      
	      
	        rotationAmount = rotationAmount + 1; // 1
	      
	     
	        i = i + 1;
	      }
	  
	    
	    
	      if (first.compareTo(second) != 0) {
	        return -1;
	      }
	    
	      return rotationAmount;
	    
	    }
	  
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		
		
		
		
	}

}
