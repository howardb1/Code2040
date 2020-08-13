package one;

import java.util.Arrays;

/*
 
What i want to do: 
	1. build a breakdown process that basically breakdown the givenAmount
	2. In this breakdown there will be stages, which will consist of math
	 being performed 
	 	2.a - In the first stage I would like to somehow be able to divide
	 	the givenAmount by 100 (iff the givenAmount is greater than $130) an then return the quotient as the numeric 
	 	value of the first stage, but pass on the remainder to the second stage 
	 	
	 	2.b - In the second stage, i want the remainder of the givenAmount from stage 1
	 		  to be divided by 50 (unless the givenAmount is less than or equal to $130, somehow make the 2nd stage the starting stage)
	 		  iff the givenAmount has an odd number in the tens place and the quotient to be returned, but if not pass
	 		   on the remainder to stage 3
	 		   
	 		   
		2.c - In the third and final stage regardless if the tens place was odd an # the remainder of the stage 2 will be 
				divided by 20, which will then leave no remainders. At this point i want the quotient  to be returned.
	 
	 	3. hopefully all the qoutients are returned properly.
	 
	 
	 
*/




public class Challenge {


public static boolean isEvenTensPlace(int amount) { //this method determines whether the tens place/outputArr 1 is an odd #
	
	int rem = amount % 20;
	
	if (rem == 0) {
		
		return true;
	}
	
	return false;
}
	

public static int numOfTwentyBills (int amount, int[] outputArr) { //This method is basically the cleanup for the amount, divding the rest or what given by 20
		
		
		boolean isEven = isEvenTensPlace(amount);
		if(isEven == true ) {
			
			outputArr[2] = amount / 20; 
			
		}
		
		return amount;
		
	}


public static int numOfFiftyBills(int amount, int[] outputArr) {
	boolean isEven = isEvenTensPlace(amount);  
    int qout1 = amount / 50;
    int remaider = amount % 50;
    
    if(isEven == false){
      //outputArr[1] = someValue
       
      outputArr[1] = qout1;
      
       return 1;
      
    }else{
      
      return amount;
    }

}



public static int numOfHundredBills(int amount, int[] outputArr) {
	
	int mod = amount % 100; 
    int qout = amount / 100;
    
    outputArr[0] = qout;
    
		/*
		 * if (outputArr [0] == 1) { System.out.println(qout); }else {
		 * System.out.print(mod); }
		 */
    
    return mod;
}

	
	/*
	 * public static char[] withdraw(int amount) { //this method is hopefully
	 * turning the amount into a char array
	 * 
	 * char [] outputArr = String.valueOf(amount).toCharArray();
	 * 
	 * 
	 * return outputArr ;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	public static void main (String args[]) {
		
		int amount = 130;
		int [] outputArr = {0,0,0};
		
		boolean isEven = isEvenTensPlace(amount);
		System.out.println("is the tens place even for " + amount + ": " + isEven);
		 
	    System.out.println("amount: " + amount);
	    System.out.println("outputArr: " + Arrays.toString(outputArr)); 
	   
		
		
	    int twenty = numOfTwentyBills(amount,outputArr);
	    int fity = numOfFiftyBills(amount, outputArr);
		int hundo = numOfHundredBills(amount, outputArr);
	}
	
	
	
}
