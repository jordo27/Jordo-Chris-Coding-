package lab4;

/**
 * <p>Title: The Card class</p>
 *
 * <p>Description: This class will represent a single playing card 
 * that has a value between 1 and 13 and a suit (clubs, diamonds, hearts or 
 * spades).  A card can return its value, suit, point value or reference to a 
 * String containing the card's value and suit.  It can determine if it a red card or 
 * a face card.  It can check to see if two cards have the same value or the same suit. </p>
 *
 * @author Christopher Gaffikin
 */

public class Card
{
    // instance variables
    private int value;
    private String suit;

    /**
     * Name: parameterized Card constructor
     * Description: gets called when an object of the Card class is instantiated sending a number 
     * as an argument - it determines the value and suit of the card based upon the 
     * number received
     * @param num a number that gets converted to a value between 1 and 13
     * and one of the four suits (clubs, diamonds, hearts, or spades)
     */
    public Card(int num)
    {
        int suitNumber;
        value = num % 13;
        if (value == 0)
            value = 13;
        suitNumber = num / 13;
        if (suitNumber == 0)
            suit = new String("clubs");
        else if (suitNumber == 1)
        	suit = new String("diamonds");
        else if (suitNumber == 2)
        	suit = new String("hearts");
        else if (suitNumber == 3)
        	suit = new String("spades");
        else
        	suit = new String("ERROR");
    }

    /**
     * Name: getValue method
     * Description: returns what's stored in the instance variable value
     * @return the state of the instance variable value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Name: getSuit method
     * Description: returns what's stored in the instance variable suit
     * @return a reference to a String that contains the state of the instance variable suit
     */
    public String getSuit()
    {
        return suit;
    }
	
    /**
     * Name: isAFaceCard method
     * Description: determines if the card is a jack, queen or king based upon the card's value
     * @return true if the card is a face card, returns false otherwise
     */
    public boolean isAFaceCard()
    {
    	if (value == 11 || value == 12 || value == 13)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    
    /**
     * Name: getPointValue method
     * Description: this method returns the point value for the card -- 10 for a face card, 
     * the actual value for cards 1 through 10
     * @return the point value of the card
     */
    public int getPointValue()
    {
    	if (value == 11 || value == 12 || value == 13)
    	{
    		return 10;
    	}
    	else
    	{
    		return value;
    	}
    }

    /**
     * Name: isRed method
     * Description: determines if the card is red or black based upon the card's suit
     * @return true if the card's suit is diamonds or hearts, returns false otherwise
     */
    public boolean isRed()
    {
    	if (suit.equals("diamonds") || suit.equals("hearts"))
    	{
    		return true;
    	}
    	else
    	{   	
    		return false;
    	}
    }
	
    /**
     * Name: equalValue method
     * Description: determines if the otherCard's value is the same as this card's value
     * @param otherCard a reference to the Card object (assumes the object has been
     * instantiated) to compare to this Card object
     * @return true if the values are equal, false if the values are not equal
     */
    public boolean equalValue(Card otherCard)
    {
    	if (value == otherCard.value)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }

    /**
     * Name: equalSuit method
     * Description: determines if the otherCards's suit is the same as
     * this card's suit
     * @param otherCard a reference to the Card object (assumes the object has been 
     * instantiated) to compare to this Card object
     * @return true if the suits are the same, false if they are not
     */
    public boolean equalSuit(Card otherCard)
    {
    	if (suit.equals(otherCard.suit))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }


    /**
     * Name: toString method
     * Description: this method returns the state of the card object
     * @return a reference to a String object that contains the value and the
     * suit of the card
     */
    public String toString()
    {
    	String svalue;
    	if (value == 1)
    	{
    		svalue = "Ace";
    	}
    	else if (value == 11)
    	{
    		svalue = "Jack";
    	}
    	else if (value == 12)
    	{
    		svalue = "Queen";
    	}
    	else if (value == 13)
    	{
    		svalue = "King";
    	}
    	else 
    	{
    		svalue = Integer.toString(value);
    	}
    	
    	String str = new String(svalue + " of " + suit);
    	return str;
    }
}
