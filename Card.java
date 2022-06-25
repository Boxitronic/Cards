class Card{
    int rank;
    int color;
    //0 = black, 1 = red
    public static enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    public Suit suit;

    Card(int rank, int color, Suit suit){
        this.rank = rank;
        this.color = color;
        this.suit = suit;
    }

    public String toString(){
        return  color + rank + " of " + suit;
    }
}