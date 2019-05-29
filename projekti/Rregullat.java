import javax.swing.*;
public class Rregullat
{CardDeck letrat;
Bunchofcards player1;
Bunchofcards player2;
Bunchofcards letra_e_mesit;
InstructionReader referi;


public Rregullat(CardDeck l, Bunchofcards p1,Bunchofcards p2,Bunchofcards m,InstructionReader r)
{letrat=l;
player1=p1;
player2=p2;
letra_e_mesit=m;
referi=r;
this.luaj();

}

public void luaj()
{while (true)
{Card mesi=letra_e_mesit.getCard(0);
String m="";
String s="";
char a;
int b;



if ((letra_e_mesit.size()%2)==0)
{boolean t=false;
int i=0;

for(int j=0;j<player1.size();j++)
{m=player1.getCard(j).getAll()+"  "+m;}
s=referi.readCommand("the mmiddle card is"+mesi.getAll()+"you have these cards\n"+m+"\n  chosse the card you want to play \n type the first letter of the suit in uppercase leave some space and then\n tupe the numerical value of that card\n 11 for jack 12 for quen 13 for king 1 for Ace \n  type uppercase N if you want to draw a card\n type X or cancel to quit").trim().toUpperCase();
a=s.charAt(0);
if(s=="X"||s==null)
{JOptionPane.showMessageDialog(null,"player 2 has won the game");

}

else if (a!='N'&&a!='X'&&s!=null)
{b=Integer.parseInt(s.substring(1).trim());

while(!t&&i<player1.size())//kontrollon se a ka shfrytezuesi kete leeter ne dore
{if(a==player1.getCard(i).getSuit()&&b==player1.getCard(i).getCount())
{t=true;}
else{i=i+1;}
}

if (t&&mesi.getSuit()==a&&mesi.getCount()==b||b==8)//nese letra perputhet me letren e mesit ose eshte 8 ka mundesi te luhet
{letra_e_mesit.AddCard(player1.remove(i));
if (b==8)
 {mesi.setSuit((JOptionPane.showInputDialog("chose the suit").trim().charAt(0)));}
}}

else if(a=='N')//merr nje leter nga deck of cards
{player1.AddCard();}

if(player1.size()==0)
{JOptionPane.showMessageDialog(null,"player 1 has won the game");}
}




else if ((letra_e_mesit.size()%2)==1)
{boolean t=false;
int i=0;

for(int j=0;j<player2.size();j++)
{m=player2.getCard(j).getAll()+"  "+m;}
s=referi.readCommand("the mmiddle card is"+mesi.getAll()+"you have these cards\n"+m+"\n  chosse the card you want to play \n type the first letter of the suit in uppercase leave some space and then\n tupe the numerical value of that card\n 11 for jack 12 for quen 13 for king 1 for Ace \n  type uppercase N if you want to draw a card\n type Xor cancel to quit").trim().toUpperCase();
a=s.charAt(0);
if(s=="X"||s==null)
{JOptionPane.showMessageDialog(null,"player 1 has won the game");

}

else if (a!='N'&&a!='X'&&s!=null)
{b=Integer.parseInt(s.substring(1).trim());

while(!t&&i<player2.size())//kontrollon se a ka shfrytezuesi kete leeter ne dore
{if(a==player2.getCard(i).getSuit()&&b==player2.getCard(i).getCount())
{t=true;}
else{i=i+1;}
}

if (t&&mesi.getSuit()==a&&mesi.getCount()==b||b==8)//nese letra perputhet me letren e mesit ose eshte 8 ka mundesi te luhet
{letra_e_mesit.AddCard(player2.remove(i));
if (b==8)
 {mesi.setSuit((JOptionPane.showInputDialog("chose the suit").trim().charAt(0)));}

}}

else if(a=='N')//merr nje leter nga deck of cards
{player2.AddCard();}

if(player2.size()==0)
{JOptionPane.showMessageDialog(null,"player 2 has won the game");}
}


}
}
}


 