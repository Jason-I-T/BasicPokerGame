import java.util.ArrayList;
import java.util.LinkedList;

public class Tester{
	public static void main(String[] args) {
		Dealer d = new Dealer();
		//d.printDeck();
		//d.printHandCards();
		//d.printRiverCards();

		ArrayList<LinkedList<int[]>> testHands = d.getPlayerHands(); 
		for(int i = 0; i < 5; i++) {
			LinkedList<int[]> oneHand = testHands.get(i);	
			oneHand.forEach((c) -> {
				System.out.printf("..%d %d..", c[0], c[1]);	
			});
			System.out.println("\n\n");
		}
	}
}
