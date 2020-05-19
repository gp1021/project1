package HorL;
import java.util.List;

import HorL.Card;
import HorL.Deck;

import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class HLview {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 52;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	private Deck deck;
	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public HLview() {
			deck = new Deck();
		}
	 
	 public String toString(Card card, int correct, int lost) {
		 return "Number of Correct Guesses: " + correct + "\n" + 
				 "Number of Incorrect Guesses: " + lost + "\n" + 
				 "Current Card: \n" + card.toString() + "\n\n" + 
				 "Do you think the next card will be higher or lower?";
	 }
}

	
