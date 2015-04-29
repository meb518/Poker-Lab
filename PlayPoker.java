public class PlayPoker{
 public static void main(String[] args){
   
   
//Populating the deck of cards
  String[] suit = {"Hearts ","Clubs ","Spades ","Diamonds "};
  String[] number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
  String[][] deckOfCards = new String[4][13];
  deckOfCards = populateDeck(suit, number);
  String[] userHand = new String[5];
  String[] computerHand = new String[5];
  System.out.println("User Hand: ");
  userHand = handGenerator(deckOfCards);
  System.out.println(" ");
  System.out.println("Computer Hand: ");
  computerHand = handGenerator(deckOfCards);
  
 }
 public static String[][] populateDeck(String [] suit, String [] number) {
   String[][] myArray = new String[4][13];   //initialize deck
   //Nested for loops to use 2 single-d arrays in main to populate deck with cards
  for( int i = 0;  i < suit.length;i++) {
     for (int j = 0; j < number.length; j++) {
         myArray[i][j] = suit[i] + number[j];
        }
    }
    return myArray;
 }
 public static String[] handGenerator(String[][] deckOfCards){ //handGenerator generates the user's hand and the computers hand.
 String[] handOfCards = new String[5];
 String storage = " ";
 for(int i = 0; i <handOfCards.length; i++){
   int randomIndex1 = (int) (Math.random() * 4);
   int randomIndex2 = (int) (Math.random() * 13);
   handOfCards[i] = deckOfCards[randomIndex1][randomIndex2];
   storage = storage + handOfCards[i];
   if(storage.indexOf(handOfCards[i]) > 1){
   randomIndex1 = (int) (Math.random() * 4);
   randomIndex2 = (int) (Math.random() * 13);
   handOfCards[i] = deckOfCards[randomIndex1][randomIndex2];
   storage = storage + handOfCards[i];
   }
   System.out.println(handOfCards[i]);
 }
 return handOfCards;
 }
}
