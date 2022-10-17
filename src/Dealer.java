/*
 * jason-I-T ... Basic Poker Game
 *
 * Desc: This program describes the dealer. Data structure of 52 elements for
 * deck. Operations to deal cards.
 *
 */
import java.util.HashMap;
import java.lang.Integer;

public class Dealer {
	private HashMap<Integer, int[]> deck;

	public Dealer() {
		//TODO:
		/* Create the deck (4 suits, A, 2-10, J, Q, K) <<<<<
		 * Implement the card dealing (Choose 15 at random)
		 */	
		this.deck = deckInit();
	}

	// Create new deck
	private HashMap<Integer, int[]> deckInit() {
		HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();

		// 4 suits x 13 cards
		int n = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				n++;	
				map.put(n, new int[] {i, j});
			}	
		}

		return map;
	}
}
