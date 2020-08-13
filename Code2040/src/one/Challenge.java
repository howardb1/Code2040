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
 
	
 
public static int numOfTwentyBills (int amount, int[] outputArr) { //This method is basically the cleanup for the amount, divding the rest or what given by 20
			
			outputArr[2] = amount / 20; //This act as the clean up crew
			
		
		  int remaining = amount -(outputArr[2] * 20);
		 			
			
		return remaining ;
		
	}


public static int numOfFiftyBills(int amount, int[] outputArr) {
	//boolean isEven = isEvenTensPlace(amount);  
    int remainder = amount % 50;
    int remaining = amount;
    
    if (remainder == 0) {						// if the modulus of amount/50 equals 0 2nd index of the array is going 
    	outputArr[1] = amount / 50;						//	is going to have a 0 in that position 							
    }
    else if  (amount < 50 ) {					//also if the amount is less than 50, than the second
    	outputArr[1] =0; 						// the second index position should have a zero in its position aswell
    } 
    else if ((remainder == 10)  || ((remainder == 30)) ) {					//This checks to see, if the remainder is ten 
    	outputArr[1] = (amount / 50) -1;		// than this line sees to it that there's a zero 
    											//portrayed in the outputArr 0 index because that means the 20 method should take of the remainder prior to getting ten 
   
    }else {										// And finally if none of these
												//	conditions are met a 1 should be place in index 1
    	outputArr[1] = (amount / 50);
    }
    													
    remaining = amount - (outputArr[1] * 50);	//allows for the remaining to be processed by the other methods
    
    return remaining;							//Gives the next step the remainder
												//once divided, the next step a value to work off of
															
			   											
			  
			  											
			 
			 
}






public static int numOfHundredBills(int amount, int[] outputArr) {
	
	int mod = amount % 100;
											// If the remainder of amount/100 is either 30 or 10 a zero should be in the 
	if ((mod == 10 ) || (mod == 30)) { 		// zero index
		outputArr[0] = (amount / 100) - 1;	// if the above conditions are met this line sees to it that theres a zero potrayed in the outputArr 0 index 				
	}else {
		outputArr[0] = (amount / 100);			// Divides the amount by 100
	}
	int remaining = amount -(outputArr[0] * 100);  //Gives the next step the remainder once divded, the next step a value to work off of
	
	
	
   return remaining ;
}

	 
	
	public static void main (String args[]) {
		
		
		  int []outputArr = {0,0,0}; 
		  int amount = 230;
		 
		
		amount = numOfHundredBills(amount, outputArr) ;
		System.out.println(Arrays.toString(outputArr));		
		
		amount = numOfFiftyBills(amount, outputArr);
		System.out.println(Arrays.toString(outputArr));
		
		amount = numOfTwentyBills(amount, outputArr);
		System.out.println(Arrays.toString(outputArr));
		
	}
	
	
	
}
