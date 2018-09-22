package pokerGame;

public class Card {
	protected String suit;
	protected String rank;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public String getSuit() { return suit; }

	public String getRank() { return rank; }
	
	public String toString() { return suit + rank; }
}
