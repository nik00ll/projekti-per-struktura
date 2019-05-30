public class NewGame
{public static void main(String[] args)
{CardDeck letrat=new CardDeck();
InstructionReader dealer=new InstructionReader();
BunchofCards1 player1=new BunchofCards1(letrat,7);
BunchofCards1 player2=new BunchofCards1(letrat,7);
BunchofCards1 mesi=new BunchofCards1(letrat,1);

Rregullat1 loja=new Rregullat1(letrat,player1,player2,mesi,dealer);
}}