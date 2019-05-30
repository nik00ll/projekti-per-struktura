/** Card  models a playing card */
public class Card
{ // definitions that one can use to describe the value of a card:
  public static final String SPADES = "S";
  public static final String HEARTS = "H";
  public static final String DIAMONDS = "D";
  public static final String CLUBS = "C";

  public static final int A = 1;
  public static final int J = 11;
  public static final int Q = 12;
  public static final int K = 13;

  public static final int SIZE_OF_ONE_SUIT = 13;  // how many cards in one suit

  // These are the card's attributes:
  private char suit;
  private int count;

  /** Constructor  Card  sets the suit and count.
    * @param s - the suit
    * @param c - the count */
  public Card(char s, int c)
  { suit = s;
    count = c;
  }

  /** getSuit returns the card's suit. */
  public char getSuit()
  { return suit; }

  /** getCount returns the card's count. */
  public int getCount()
  { return count; }
  
  public String getAll()
  {return suit+" "+count;}
  
  public void setSuit(char i)
  {suit=i;}
  

                  
}
