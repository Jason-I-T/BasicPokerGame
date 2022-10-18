/*
 * jason-I-T ... Basic Poker Game
 *
 * Desc: This program describes the dealer. Data structure of 52 elements for
 * deck. Operations to deal cards.
 *
 */
import java.util.HashMap;
import java.lang.Integer;
//import java.lang.Math;

public class Dealer {
	private HashMap<Integer, int[]> deck;

	public Dealer() {
		//TODO:
		/* Redo creating the cards we play with
		 * Implement the card dealing
		 */	
		this.deck = deckInit();
	}

	// Create new deck
	private HashMap<Integer, int[]> deckInit() {
		HashMap<Integer, int[]> cards = new HashMap<Integer, int[]>();
		for(int i = 0; i < 15; i++) {
			int suit = (int)((Math.random() * 1000) % 4);
			int rank = (int)((Math.random() * 1000) % 13);	
			cards.put(i, new int[] {suit, rank});
		}	
		return cards;
	}

	public void printDeck() {
		this.deck.forEach((n, c) -> {
			System.out.printf("Card %d: %d %d\n", n, c[0], c[1]);
		});
	}
}
