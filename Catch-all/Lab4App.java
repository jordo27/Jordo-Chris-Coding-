package lab4;

/**
 * <p>Title: The Lab4 Application class</p>
 *
 * <p>Description: This class tests the various methods in the Card class to see what is 
 * returned and determines if the methods work properly. </p>
 *
 * @author <your names here>
 */

public class Lab4App 
{
	public static void main(String[] args)
	{
		Card card1 = new Card(24);
		System.out.println("Card 1: " + card1.toString());
		System.out.println("Card 1's value is: " + card1.getValue());
		System.out.println("Card 1's suit is: " + card1.getSuit());
		System.out.println("Card 1 is a face card: " + card1.isAFaceCard());
		System.out.println();
		
		Card card2 = new Card(7);
		System.out.println("Card 2: "+card2.toString());
		System.out.println("Card 2 is a face card: " + card2.isAFaceCard());
		System.out.println();
		
		System.out.println("Card 1's point value is: " + card1.getPointValue());
		System.out.println("Card 2's point value is: " + card2.getPointValue());
		System.out.println();
		
		Card card3 = new Card(8);
		Card card4 = new Card(36);
		Card card5 = new Card(50);
		System.out.println("Card 1 is " + card1.getSuit() + " - color is red: " + card1.isRed());
		System.out.println("Card 3 is " + card3.getSuit() + " - color is red: " + card3.isRed());
		System.out.println("Card 4 is " + card4.getSuit() + " - color is red: " + card4.isRed());
		System.out.println("Card 5 is " + card5.getSuit() + " - color is red: " + card5.isRed());
		System.out.println();
		
		Card card6 = new Card(14); 
		Card card7 = new Card(26);
		Card card8 = new Card(38);
		System.out.println(card6.toString() + "\n" + card7.toString());
		System.out.println(card8.toString());
		System.out.println();
		
		if (card1.equalValue(card5))
		{
			System.out.println(card1 + " and " + card5 + " have the same value.");
		}
		else 
		{
			System.out.println(card1 + " and " + card5 + " do not have the same value.");
		}
		
		if (card2.equalValue(card3))
		{
			System.out.println(card2 + " and " + card3 + " have the same value.");
		}
		else
		{
			System.out.println(card2 + " and " + card3 + " do not have the same value.");
		}
		
		if (card2.equalSuit(card3))
		{
			System.out.println(card2 + " and " + card3 + " have the same suit.");
		}
		else
		{
			System.out.println(card2 + " and " + card3 + " do not have the same suit.");
		}
		
		if (card1.equalSuit(card5))
		{
			System.out.println(card1 + " and " + card5 + " have the same suit.");
		}
		else
		{
			System.out.println(card1 + " and " + card5 + " do not have the same suit.");
			
		}
	}
}
