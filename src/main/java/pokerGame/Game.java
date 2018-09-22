package pokerGame;

import java.util.*;

public class Game {
	static Deck deck;
	static List<Card> river;
	static List<Card> cardsToBeat;
	static List<Card> AIPcards;
	static String riverDisplay;
	static String cardsToBeatDisplay;
	static String AIPcardsDisplay;
	
	public static void main(String args[]) {
		deck = new Deck();
		deck.shuffle();
		
		river = new ArrayList<Card>();
		river.addAll(deck.draw(3));
		
		cardsToBeat = new ArrayList<Card>();
		cardsToBeat.addAll(deck.draw(2));
		
		AIPcards = new ArrayList<Card>();
		AIPcards.addAll(deck.draw(2));
		
		riverDisplay = "RIVER: " + river.get(0).toString() + " " +
				river.get(1).toString() + " " +
				river.get(2).toString() + "\n";
		cardsToBeatDisplay = "Cards to beat: " + cardsToBeat.get(0).toString() + 
				" " + cardsToBeat.get(1).toString() + "\n";
		AIPcardsDisplay = "AIP cards: " + AIPcards.get(0).toString() + " " +
		AIPcards.get(1).toString() + "\n";
		
		display();
	}

	public static void display() {
		System.out.print(riverDisplay);
		System.out.print(cardsToBeatDisplay);
		System.out.print(AIPcardsDisplay);
	}
}
