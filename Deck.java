import java.util.ArrayList;
import java.util.*;

class Deck{
    ArrayList<Card> Cards = new ArrayList<Card>();

    Deck(){
        int cardnum = 1;
        int ranknum = 0;
        int suitnum = 0;
        int colornum = 0;
        String temp = "";
        String colorTemp = "";
        String rankTemp = "";
        
        while(cardnum <= 52){
            if(ranknum > 12){
                ranknum = 0;
                if(colornum == 0){
                    colornum++;
                }
                else{
                    colornum = 0;
                }
                if(suitnum < 3){
                    suitnum++;
                }
            }
            Cards.add(new Card(ranknum, colornum, Card.Suit.values()[suitnum]));
            cardnum++;
            ranknum++;
            if(suitnum == 0){
                temp = "clubs";
            }
            else if(suitnum == 1){
                temp = "diamonds";
            }
            else if(suitnum == 2){
                temp = "spades";
            }
            else if(suitnum == 3){
                temp = "hearts";
            }

            if(colornum == 0){
                colorTemp = "black";
            }
            else{
                colorTemp = "red";
            }

            if(ranknum == 1){
                rankTemp = "ace";
            }
            else if(ranknum == 2){
                rankTemp = "2";
            }
            else if(ranknum == 3){
                rankTemp = "3";
            }
            else if(ranknum == 4){
                rankTemp = "4";
            }
            else if(ranknum == 5){
                rankTemp = "5";
            }
            else if(ranknum == 6){
                rankTemp = "6";
            }
            else if(ranknum == 7){
                rankTemp = "7";
            }
            else if(ranknum == 8){
                rankTemp = "8";
            }
            else if(ranknum == 9){
                rankTemp = "9";
            }
            else if(ranknum == 10){
                rankTemp = "10";
            }
            else if(ranknum == 11){
                rankTemp = "jester";
            }
            else if(ranknum == 12){
                rankTemp = "queen";
            }
            else if(ranknum == 13){
                rankTemp = "king";
            }
            
            //System.out.println(colorTemp + " " + rankTemp + " of " + temp);
            //^used to see all cards in deck^
        }
    }
}