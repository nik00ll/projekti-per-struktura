import javax.swing.*;
public class Rregullat1
{CardDeck letrat;
BunchofCards1 player1;
BunchofCards1 player2;
BunchofCards1 letra_e_mesit;
InstructionReader referi;
public int radha=1;

public Rregullat1(CardDeck l, BunchofCards1 p1,BunchofCards1 p2,BunchofCards1 m,InstructionReader r)
{letrat=l;
player1=p1;
player2=p2;
letra_e_mesit=m;
referi=r;
this.loja();

}

public void loja()
{while (true)
{if (radha%2==1)
{this.luaj1();}
else{this.luaj();}}}


public void luaj()
{
String m="";
String s="";
char a;
int b;


for(int j=0;j<player1.size();j++)
{m=player1.getall(j)+"  "+m;}
if(radha==2){
referi.showCommand("Chosse the card you want to play \nType the first letter of the suit in uppercase leave some space and then\n type the numerical value of that card\n11 for jack 12 for quen 13 for king 1 for Ace \nH for hearts D fo diamonds c for clubs S fpr Spades\ntype uppercase N if you want to draw a card\ntype X or cancel to quit");}
s=referi.readCommand("tThe mmiddle card is:\n           "+letra_e_mesit.getall(0)+"\n you have these cards:\n"+m+"\n ").toUpperCase();
a=s.charAt(0);
if(a=='X'||s==null)
{referi.showCommand("player 2 has won the game");
try
{
    Thread.sleep(10000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
System.exit(0);
}

else if (a!='N'&&a!='X'&&s!=null)
{b=Integer.parseInt(s.substring(1).trim());

if(this.inHand(a,b,player1)!=(-1))
{

if (this.inMiddle(a,b,letra_e_mesit))//nese letra perputhet me letren e mesit ose eshte 8 ka mundesi te luhet
{letra_e_mesit.addCard(player1.getCard(this.inHand(a,b,player1)));

player1.remove(this.inHand(a,b,player1));
if (b==8)
 {letra_e_mesit.setSuit(0,(referi.readCommand("chose the suit").charAt(0)));}
radha=radha+1;}
}}

else if(a=='N')//merr nje leter nga deck of cards
{player1.Draw();}

if(player1.size()==0)
{referi.showCommand("player 1 has won the game");}
try
{
    Thread.sleep(10000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
System.exit(0);
}

public void luaj1()
{
String m="";
String s="";
char a;
int b;


for(int j=0;j<player2.size();j++)
{m=m+"  "+player2.getall(j);}
if(radha==1){
referi.showCommand("Chosse the card you want to play \nType the first letter of the suit in uppercase leave some space and then\n type the numerical value of that card\n11 for jack 12 for quen 13 for king 1 for Ace \nH for hearts D fo diamonds c for clubs S fpr Spades\ntype uppercase N if you want to draw a card\ntype X or cancel to quit" );}
s=referi.readCommand("the mmiddle card is\n      "+letra_e_mesit.getall(0)+"\n you have these cards\n"+m+"\n  ").toUpperCase();
a=s.charAt(0);
if(a=='X'||s==null)
{referi.showCommand("player 2 has won the game");
try
{
    Thread.sleep(10000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
System.exit(0);

}

else if (a!='N'&&a!='X'&&s!=null)
{b=Integer.parseInt(s.substring(1).trim());

if(this.inHand(a,b,player2)!=(-1))
{

if (this.inMiddle(a,b,letra_e_mesit))//nese letra perputhet me letren e mesit ose eshte 8 ka mundesi te luhet
{letra_e_mesit.addCard(player2.getCard(this.inHand(a,b,player2)));

player2.remove(this.inHand(a,b,player2));
if (b==8)
 {letra_e_mesit.setSuit(0,(referi.readCommand("chose the suit").charAt(0)));}
radha=radha+1;}
}}

else if(a=='N')//merr nje leter nga deck of cards
{player2.Draw();}

if(player2.size()==0)
{referi.showCommand("player 1 has won the game");}
try
{
    Thread.sleep(10000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
System.exit(0);
}







public int inHand(char o,int p,BunchofCards1 l)
{boolean t=false;
int i=0;
while(!t&&i<l.size())//kontrollon se a ka shfrytezuesi kete leeter ne dore
{if(l.same(o,p,i))
{t=true;}
else{i=i+1;}

}
if(t=true)
{
return i;
}
return -1;

}


public boolean inMiddle(char o,int p,BunchofCards1 l)
{boolean h=false;
if(l.similar(o,p,0)||p==8)
{h=true;}
return h;
}
}

