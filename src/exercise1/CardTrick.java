package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Jaskaran Singh
 * @author Jaskaran Singh Jan 28, 2023
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[((int)(Math.random()*3)+1)]);
            hand[i] = card;
        }
        System.out.print("Pick a card value from 1 to 13: ");
        int userValue = input.nextInt();
        System.out.print("Pick a card suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
        int userSuit = input.nextInt() - 1 ;
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean guess = false;
        
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                guess = true;
                break;
            }
        }
        if (guess) {
            printInfo();
        } else {
                System.out.println("Sorry, your guess was incorrect.");
            }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Jaskaran Singh Jan 2023
     * I am done
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Jaskaran Singh, but you can call me Jaskaran");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
