import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Random;

class Main{
    public static void main(String[] args) throws Exception {
        int p1C = 0; //player1
        int p2C = 0; //player2 or bot
        boolean bot = true;
        String tempInput;
        Card p1tempCard;
        Card p2tempCard;
        String tempPrint;

        Deck deck1 = new Deck();
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> player1c = new ArrayList<Card>();
        ArrayList<Card> player2c = new ArrayList<Card>();
        //two arraylists one for player, one for bot or player2, it will select players back and forth and give them a random card from the deck and removes it from the deck

        System.out.println("Type Game you Wish To Play.");
        String temp = sc.next();
        System.out.println("Type Game you Wish To Play (again).");
        temp = sc.next();
        if(temp.equals("war")) {
            Random r = new Random();
            p1C = 26;
            p2C = 26;
            int cardTurn = 0; //0 = player 1, 1 = player 2 or bot
            while(player1c.size() < 26 && player2c.size() < 26)
            {
                Card tempCard = deck1.Cards.get(0);
                int tempInt = r.nextInt(1, deck1.Cards.size());

                if(cardTurn == 0)
                {
                    Card removal = deck1.Cards.remove(tempInt);
                    player1c.add(removal);
                    cardTurn = 1;
                }
                else
                {
                    Card removal = deck1.Cards.remove(tempInt);
                    player2c.add(removal);
                    cardTurn = 0;
                }
            }
            cardTurn = 0;
            while(p1C < 52 && p2C < 52)
            {
                if(cardTurn == 0){
                    System.out.println("Player 1's Turn");
                    System.out.println("Top, Bottom, Shuffle?");
                    tempInput = sc.next();
                    p1tempCard = null;
                    tempPrint = null;
                    for(int i = 1; i == 1;){
                        if(tempInput.equals("top"))
                        {
                            p1tempCard = player1c.get(0);
                            i = 0;
                        }
                        else if(tempInput.equals("bottom"))
                        {
                            int i2 = player1c.size();
                            p1tempCard = player1c.get(i2 - 1);
                            i = 0;
                        }
                        else if(tempInput.equals("shuffle"))
                        {
                            Collections.shuffle(player1c);
                            p1tempCard = player1c.get(0);
                            i = 0;
                        }
                    }
                    if(p1tempCard.rank == 1)
                    {
                        tempPrint = "Ace";
                    }
                    if(p1tempCard.rank == 2)
                    {
                        tempPrint = "2";
                    }
                    if(p1tempCard.rank == 3)
                    {
                        tempPrint = "3";
                    }
                    if(p1tempCard.rank == 4)
                    {
                        tempPrint = "4";
                    }
                    if(p1tempCard.rank == 5)
                    {
                        tempPrint = "5";
                    }
                    if(p1tempCard.rank == 6)
                    {
                        tempPrint = "6";
                    }
                    if(p1tempCard.rank == 7)
                    {
                        tempPrint = "7";
                    }
                    if(p1tempCard.rank == 8)
                    {
                        tempPrint = "8";
                    }
                    if(p1tempCard.rank == 9)
                    {
                        tempPrint = "9";
                    }
                    if(p1tempCard.rank == 10){
                        tempPrint = "10";
                    }
                    if(p1tempCard.rank == 11)
                    {
                        tempPrint = "Jack";
                    }
                    if(p1tempCard.rank == 12)
                    {
                        tempPrint = "Queen";
                    }
                    if(p1tempCard.rank == 13)
                    {
                        tempPrint = "King";
                    }
                    System.out.println("Player 1 Card Rank: " + tempPrint);
                    cardTurn = 1;
                }
                else if(cardTurn == 1)
                {
                    tempPrint = "ERROR: card not found";
                    System.out.println("Player 2's Turn");
                    if(bot == false){
                        System.out.println("Top, Bottom, Shuffle?");
                        tempInput = sc.nextLine();
                        p1tempCard = null;
                        for(int i = 1; i == 1;){
                            if(tempInput.equals("top"))
                            {
                                p1tempCard = player1c.get(0);
                            }
                            else if(tempInput.equals("bottom"))
                            {
                                int i2 = player1c.size();
                                p1tempCard = player1c.get(i2 - 1);
                            }
                            else if(tempInput.equals("shuffle"))
                            {
                                Collections.shuffle(player1c);
                                p1tempCard = player1c.get(0);
                            }
                            else{
                                i = 0;
                            }
                        }
                    }
                    else
                    {
                        p1tempCard = player2c.get(0);
                    }

                    if(p1tempCard.rank == 1)
                    {
                        tempPrint = "Ace";
                    }
                    if(p1tempCard.rank == 2)
                    {
                        tempPrint = "2";
                    }
                    if(p1tempCard.rank == 3)
                    {
                        tempPrint = "3";
                    }
                    if(p1tempCard.rank == 4)
                    {
                        tempPrint = "4";
                    }
                    if(p1tempCard.rank == 5)
                    {
                        tempPrint = "5";
                    }
                    if(p1tempCard.rank == 6)
                    {
                        tempPrint = "6";
                    }
                    if(p1tempCard.rank == 7)
                    {
                        tempPrint = "7";
                    }
                    if(p1tempCard.rank == 8)
                    {
                        tempPrint = "8";
                    }
                    if(p1tempCard.rank == 9)
                    {
                        tempPrint = "9";
                    }
                    if(p1tempCard.rank == 10){
                        tempPrint = "10";
                    }
                    if(p1tempCard.rank == 11)
                    {
                        tempPrint = "Jack";
                    }
                    if(p1tempCard.rank == 12)
                    {
                        tempPrint = "Queen";
                    }
                    if(p1tempCard.rank == 13)
                    {
                        tempPrint = "King";
                    }
                    System.out.println("Player 2 Card Rank: " + tempPrint);
                    System.out.println("""
┌───────────┐
│ ☻         │
│           │
│           │
│     1     │
│           │
│           │
│         ☻ │
└───────────┘""");
                    cardTurn = 0;
                }
            }
        }
    }
}