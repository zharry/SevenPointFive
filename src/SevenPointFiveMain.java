import java.util.ArrayList;
import java.util.Collections;

public class SevenPointFiveMain {

	public static ArrayList<Card> deck = new ArrayList<Card>();

	public static void main(String[] args) {
		init();
		
		System.out.println("Unshuffled Array: ");
		for (int i = 0; i < deck.size(); i++) 
			System.out.format("%-4d", deck.get(i).getID());
		System.out.println("\n");
		
		System.out.println("Unshuffled Array: ");
		for (int i = 0; i < deck.size(); i++)
			System.out.print(deck.get(i).getCombined() + " ");
		System.out.println("\n");

		System.out.println("Card Point Values: ");
		for (int i = 0; i < deck.size(); i++)
			System.out.print(deck.get(i).getPointValue() + " ");
		System.out.println("\n");

		shuffleDeck();

		System.out.println("Shuffled Array: ");
		for (int i = 0; i < deck.size(); i++)
			System.out.print(deck.get(i).getCombined() + " ");
		System.out.println("\n");

		System.out.println("Shuffled Array Point Values");
		for (int i = 0; i < deck.size(); i++)
			System.out.print(deck.get(i).getPointValue() + " ");
		System.out.println("\n");

	}

	public static void init() {
		for (int i = 0; i < 40; i++)
			deck.add(new Card(i));
	}

	public static void shuffleDeck() {
		Collections.shuffle(deck);
	}

}
