
public class BunchofCards1
{
public CardDeck c;
Card[] bunch = new Card[52];

public BunchofCards1(CardDeck e,int initial_amount)
{c=e;
for(int i=0;i<initial_amount;i++)
{bunch[i]=c.newCard();}
}



public int size()
{int a=0;
for(int i=0;i<52;i=i+1)
{if (bunch[i]!=null)
{a=a+1;}
}
return a;
}
public void Draw()
{ 
if(c.moreCards()){
this.addCard(c.newCard());

}}

public void addCard(Card e)
{for(int i=this.size();i>0;i=i-1)
{bunch[i]=bunch[i-1];

}bunch[0]=e;
}
public void remove(int q)
{ for ( int i = q+1; i != this.size();  i = i + 1 )
             
               { bunch[i - 1] = bunch[i]; }
               bunch[this.size()-1]=null;
               }

public Card getCard(int w)
{return bunch[w];}


public void setSuit(int i,char b)
{bunch[i].setSuit(b);}


public int getcount(int r)
{return bunch[r].getCount();}

public char getsuit(int t)
{return bunch[t].getSuit();}

public String getall(int u)
{return bunch[u].getSuit()+" "+bunch[u].getCount();
}
public boolean similar(char a,int b,int letra)
{boolean v=false;
if(bunch[letra].getCount()==b||bunch[letra].getSuit()==a)
{v=true;}
return v;}

public boolean same(char a,int b,int letra)
{boolean v=false;
if(bunch[letra].getCount()==b&&bunch[letra].getSuit()==a)
{v=true;}
return v;}
}