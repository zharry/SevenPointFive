
public class Card {

	private int id, suit, value;
	private double pointValue;

	public Card(int cardID) {
		id = cardID;
		suit = cardID / 10;
		value = cardID % 10;
		pointValue = value == 0 || value == 8 || value == 9 ? 0.5 : value;
	}

	public int getID() {
		return id;
	}

	public int getSuit() {
		return suit;
	}

	public String getSuit(boolean returnAsString) {
		return suit == 0 ? "D" : suit == 1 ? "C" : suit == 2 ? "H" : "S";
	}

	public int getValue() {
		return value;
	}

	public String getValue(boolean returnAsString) {
		return value == 0 ? "K" : value == 1 ? "A" : value == 8 ? "J" : value == 9 ? "Q" : value + "";
	}

	public double getPointValue() {
		return pointValue;
	}

	public String getCombined() {
		return getValue(true) + "" + getSuit(true) + " ";
	}

}
