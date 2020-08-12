package one;

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
public static boolean isEvenTensPlace(int amount) {
	
	int rem = amount % 20;
	
	if (rem == 0) {
		
		return true;
	}
	
	return false;
}
	




public static int numOfTwentyBills (int amount, int[] outputArr) {
		
		
		
		
		
		return amount;
		
	}
	
	public static int [] withdraw(int amount) {
		
		
		
		return null;
		
	
	}

}
