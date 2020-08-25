/*  
    August 22, 2020
    Purpose: This is a card game called war. 
    Each player turns up a card at the same time and the player with the higher card takes both cards and puts them, face down, on the bottom of his stack. 
    If the cards are the same rank, it is War. 
    Each player turns up one card face down and one card face up. 
    The player with the higher cards takes both piles (six cards).
*/
class Card {
    private int rank; //initialize the rank (2,3,4...King, Ace)
    private int suit; //initialize the suit (spades, hearts...)
    
    //constructor
    public Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }//end construcor
    
    //getter method
    public int getCard(){
        return rank; 
    }//end getCard
    
    //setter method
    public void setCard(int rank){
        this.rank = rank;
    }//end setCard
    
    @Override
    public String toString(){
    //combine rank and suit together into a single string(ex: Ace of Diamonds)

        //suing StringBuilder for modifiability later on
        StringBuilder displayCard = new StringBuilder();
        
        //personal choice to use switch
        switch(rank){
            //since rank is int type, now match int 11 to String jack...14 to Ace
            case 11:
                displayCard.append("Jack");
                break;
            case 12:
                displayCard.append("Queen");
                break;
            case 13:
                displayCard.append("King");
                break;
            case 14:
                displayCard.append("Ace");
                break;    
            default:
                displayCard.append(rank); //number from 2 to 10 does not need to modify
                break;
        }//end rank switch
        
        displayCard.append(" of "); //setting the format of the output
        
        switch(suit){
            case 0:
                displayCard.append("Spades");
                break;
            case 1:
                displayCard.append("Hearts");
                break;
            case 2:
                displayCard.append("Clubs");
                break;
            case 3:
                displayCard.append("Diamonds");
                break;
            default: //anything else will do nothing
                break;
        }//end suit switch
        
        //return the result of an entire combined string
        return displayCard.toString();
    }//end toString
    
}//end Card Class
