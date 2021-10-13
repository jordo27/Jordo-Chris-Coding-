package proj2;
import cardgames.*;

/**
 * Title: Card Games 2
 * Description: This Program draws three cards from a random deck and shows the three cards in a window.
 * The program outputs the value and suit of each card and tells the user if a pair exists amongst 
 * the three cards. It then tells the user the highest point value out of the three cards, then the sum
 * of the three point values, and if the user scored 25 points or higher, tells the user
 * that they have won the game, otherwise it tells the user that the computer wins.
 * @author Chris Gaffikin
*/
public class Project2 
{
    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		//creates a new GUI window
		GUI theWindow = new GUI();
		
		//creates a new deck and shuffles it
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		//draws three cards from the deck
		Card card1 = theDeck.dealCard();
		Card card2 = theDeck.dealCard();
		Card card3 = theDeck.dealCard();
		
		//test definitions of cards used to test different instances of the three cards
		//Card card1 = new Card(35);
		//Card card2 = new Card(10);
		//Card card3 = new Card(36);
		
		//shows three cards in the gui window
		theWindow.showCard(card1);
		theWindow.showCard(card2);
		theWindow.showCard(card3);
		
		//outputs to console the suit and value of each card
		System.out.println("Card 1 is: " + card1.toString());
		System.out.println("Card 2 is: " + card2.toString());
		System.out.println("Card 3 is: " + card3.toString());
		
		//set of boolean checks to determine if a pair exists amongst the three cards.
		boolean check = (card1.getValue() == card2.getValue());
		boolean check2 = (card2.getValue() == card3.getValue());
		boolean check3 = (card1.getValue() == card3.getValue());
		
		//outputs whether a pair exists or not
		if (check || check2 || check3) 
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		//determines highest value of three cards and output value to console.
		int temp = card1.getValue() > card2.getValue() ? card1.getValue() : card2.getValue(); 
		int largest = card3.getValue() > temp ? card3.getValue() : temp; 
		System.out.println("The highest value is " + largest);
		
		//calculates the sum of the point values of the three cards.
		int sum = card1.getPointValue() + card2.getPointValue() + card3.getPointValue(); 
		System.out.println("The sum is " + sum);

		//determines if the computer or the user wins the game based on scoring 25 points or higher.
		if(sum >= 25)
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Computer wins.");
		}
		
	}
}
