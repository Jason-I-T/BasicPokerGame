/* 
 * jason-I-T ... Basic Poker Game ... Player.java
 *
 * Desc: This program describes common properties and operations computer players 
 *       and human players have.
 *
 *
 */
import java.util.LinkedList;

public class Player {
	private LinkedList<int[]> hand;

	public Player(LinkedList<int[]> hand) {
		this.hand = hand;	
	}

	public LinkedList<int[]> getHand() { return this.hand; }

	////////////////////////////////////////////////////////////////////////
	////////////////////////////DEBUGGING METHODS///////////////////////////
	////////////////////////////////////////////////////////////////////////
	
	public void printHand() {
		for(int[] cards: this.hand) {
			System.out.printf("| %d, %d |", cards[0], cards[1]);		
		}	
		System.out.println("\n---------------------");
	}
}
