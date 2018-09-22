package pokerGame;

import java.util.*;

public class Game {
	static Deck deck;
	static List<Card> river;
	static List<Card> cardsToBeat;
	static List<Card> AIPcards;
	
	public static void main(String args[]) {
		deck = new Deck();
		deck.shuffle();
		
		river = new ArrayList<Card>();
		river.addAll(deck.draw(3));
		
		cardsToBeat = new ArrayList<Card>();
		cardsToBeat.addAll(deck.draw(2));
		
		AIPcards = new ArrayList<Card>();
		AIPcards.addAll(deck.draw(2));
	}
}
