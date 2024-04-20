package guessingGame;

public class GuessingGame {
   
    
	public static void main(String[] args) {
    	
    	System.out.println("Let's play a guessing game.");
    	System.out.println("Guess a number between 1 and a million.");
    	System.out.println("In hexadecimal, before I start flooding the room with a deadly neurotoxin.");
    	System.out.println("You have thirty seconds");
    	System.out.println("Your guess?:");
    	try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	System.out.println("It's your old friend, deadly neurotoxin. If I were you, I'd take a deep breath. And hold it.");
     

    }
    
    
         

}
