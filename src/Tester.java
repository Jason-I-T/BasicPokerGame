import java.util.ArrayList;
import java.util.LinkedList;

public class Tester{
	public static void main(String[] args) {
		Dealer d = new Dealer();
		//d.printDeck();
		//d.printHandCards();
		//d.printRiverCards();
		//d.printPlayerHands();
		/*
		for(int i = 0; i < 3; i++) { // 3 stages of river revealing..
			int[] a;
			if(i == 0) {
				for(int j = 0; j < 3; j++) {
					a = d.getRiver();
					System.out.println(a[0] + ",, " + a[1]);
				}	
				continue;
			}
			a = d.getRiver();
			System.out.println(a[0] + ", " + a[1]);	
		}
		*/

		ArrayList<LinkedList<int[]>> playerHands = d.getPlayerHands();
		LinkedList<Player> players = new LinkedList<>();

		for(LinkedList<int[]> hand: playerHands)
			players.add(new Player(hand));	

		for(Player p: players)
			p.printHand();	
	}
}
