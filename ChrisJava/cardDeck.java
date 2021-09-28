package cardDeck;
import cardgames.*;

public class cardDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck theDeck;
		theDeck = new Deck();
		
		theDeck.shuffleDeck();
		System.out.println();
		Card card1;
		card1 = theDeck.dealCard();
	}

}
