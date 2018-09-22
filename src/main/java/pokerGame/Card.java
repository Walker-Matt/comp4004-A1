package pokerGame;

public class Card {
	protected String suit;
	protected String rank;
	protected int order;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
		
		if(rank.equals("J")) {
			order = 10;
		} else if(rank.equals("Q")) {
			order = 11;
		} else if(rank.equals("K")) {
			order = 12;
		} else if(rank.equals("A")) {
			order = 13;
		} else {
			order = Integer.parseInt(rank) - 1;
		}
	}
	
	public String getSuit() { return suit; }

	public String getRank() { return rank; }
	
	public int getOrder() { return order; }
	
	public String toString() { return suit + rank; }
}
