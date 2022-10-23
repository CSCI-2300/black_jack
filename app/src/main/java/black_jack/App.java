package black_jack;

import java.awt.event.*;
import black_jack.model.*;
import black_jack.view.*;

public class App
{
    public static void dealTwo(Deck deck, Player player)
    {
       deck.dealOneCard(player);
       deck.dealOneCard(player);
    }
    public static void main(String []args)
    {
        // Objects from our original version of the game
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        deck.shuffle();
        dealTwo(deck, player);
        dealTwo(deck, dealer);

        // Graphical User Interface object
        BlackJackTable gameTable = new BlackJackTable();
        gameTable.showHand(player.getHand(), false);
        gameTable.showHand(dealer.getHand(), true);
    }
}
