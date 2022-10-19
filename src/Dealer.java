/*
 * jason-I-T ... Basic Poker Game... Dealer.java
 *
 * Desc: This program describes the dealer. Data structure of 15 elements for
 * the deck. The deck is used in operations to deal cards.
 */

import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Integer;

public class Dealer {
	private HashMap<Integer, int[]> deck;

	public Dealer() {
		/*TODO:
		 * 	Implement dealing to players and the river
		 * 	Implement a way to reveal the river after each stage	
		 */	
		this.deck = deckInit();
	}

	// Create new deck
	private HashMap<Integer, int[]> deckInit() {
		HashMap<Integer, int[]> cards = new HashMap<Integer, int[]>();
		
		// Uniquely picking a random cards until we have 15 (hand+river)
		int i = 0;
		do { 
			int suit = (int)((Math.random() * 1000) % 4);
			int rank = (int)((Math.random() * 1000) % 13);	
			int[] temp = {suit, rank};
			if(!isCopy(cards, temp)) {
				cards.put(i, temp);	
				i++;
			} 
		} while(i < 15);	

		return cards;
	}

	// Used to ensure the deck will not have copies...deckInit()
	private boolean isCopy(HashMap<Integer, int[]> map, int[] newEntry){
		for(int[] pair: map.values())
			if(pair[0]==newEntry[0] && pair[1]==newEntry[1])
				return true; 	

		return false;	
	}

	// TODO
	/* 
	private Stack<Integer> handInit() {
				
	}

	private Queue<Integer> riverInit() {
	
	}
	*/

	/**********************************************************************
	 **********************************************************************
	 ***********************DEBUGGING**FUNCTIONS***************************
	 **********************************************************************
	 **********************************************************************/

	public void printDeck() {
		this.deck.forEach((n, c) -> {
			System.out.printf("Card %d: %d %d\n", n, c[0], c[1]);
		});
	}
}
