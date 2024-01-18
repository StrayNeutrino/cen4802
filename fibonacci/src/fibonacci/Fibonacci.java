package fibonacci;

/**
 * Calculates and returns the nth number of the Fibonacci sequence, the sequence 
 * of numbers 1, 1, 2, 3, 5, 8, 13, 21, etc, each of which, after the second, is the 
 * sum of the two previous numbers.
 * <p>
 * The program has one method to computer the nth # and another method to call
 * it, using the number 10. 
 * <p>
 * 
 * @author Christina Burris
 * @version 1.0 1/18/2024
 */

public class Fibonacci {
	/**
	 * Calculates and returns the nth number of the Fibonacci sequence
	 * <ul>
	 * <li>Returns 0, if n=0
	 * <li>Returns 1, if n=0
	 * </ul>
	 * 
	 * Otherwise:
	 * <ol type="1">
	 * <li>An int array (fibArray) is populated with the sequence.
	 * <li>An int (fib) is set equal to the nth number in array and returned.
	 * </ol>
	 * @param n	number denoting ordinal # of Fibonacci number
	 * @return 	nth number of sequence
	 */
	public static int fib(int n) {
		
		/**
		 * number to be returned
		 */
		int fib;
		/**
		 * array to hold numbers in Fibonacci sequence
		 */
		int[] fibArray;
		/**
		 * sets size of array equal to nth digit +1
		 */
		fibArray = new int[n+1];
		
		if (n <= 1)
            return n;
		
		else {
		fibArray[0]=0;
		fibArray[1]=1;
		
			for (int i=2; i < n+1; i++) {
				int temp = (fibArray[i-2]) + fibArray[i-1];
				fibArray[i] = temp;
			}
			
		fib=fibArray[n];
		return fib;
		}
	}
	/**
	 * Main method tests fib method.
	 * <ul>
	 * <li>Sends int(n) to fib method.
	 * <li>Prints int returned, along with descriptive message, to screen.
	 * </ul>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * number used to call method
		 */
		int n = 10;
		System.out.println("The " + n + "th term of the Fibonacci sequence is " +fib(n));

	}

}
