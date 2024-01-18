package fibonacci;

public class Fibonacci {
	
	public static int fib(int n) {
		
		int fib;
		int[] fibArray;
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

	public static void main(String[] args) {

		int n = 10;
		System.out.println("The " + n + "th term of the Fibonacci sequence is " +fib(n));

	}

}
