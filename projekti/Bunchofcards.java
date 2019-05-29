import java.util.*;
public class Bunchofcards /*modelon grupe te letrava qofshin ato ne dore apo ne mes te tavolines*/
{public CardDeck c;
ArrayList<Card> bunch = new ArrayList<Card>();

public Bunchofcards(CardDeck e,int initial_amount)
{c=e;
for(int i=0;i<initial_amount;i++)
{bunch.add(c.newCard());}
}


public void AddCard()
{ boolean t=false;
if(c.moreCards()){
bunch.add(0,c.newCard());

}

}

public void AddCard(Card e)
{bunch.add(0,e);}


public Card remove(int i)
{Card e;
e=bunch.get(i);
bunch.remove(i);
return e;
}
public ArrayList<Card> getCards()
{return bunch;}

public Card getCard(int i)
{return bunch.get(i);}

public int size()
{return bunch.size();}






}