public class NewGame
{public static void main(String[] args)
{CardDeck letrat=new CardDeck();
InstructionReader dealer=new InstructionReader();
Bunchofcards player1=new Bunchofcards(letrat,7);
Bunchofcards player2=new Bunchofcards(letrat,7);
Bunchofcards mesi=new Bunchofcards(letrat,1);

Rregullat loja=new Rregullat(letrat,player1,player2,mesi,dealer);
}}