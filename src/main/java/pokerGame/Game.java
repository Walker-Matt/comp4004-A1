package pokerGame;

import java.util.*;

public class Game {
	static Deck deck;
	static List<Card> cardsToBeat;
	static List<Card> AIPcards;
	static String cardsToBeatDisplay;
	static String AIPcardsDisplay;
	
	public static void main(String args[]) {
		deck = new Deck();
		deck.shuffle();
		
		cardsToBeat = new ArrayList<Card>();
		cardsToBeat.addAll(deck.draw(5));
		
		AIPcards = new ArrayList<Card>();
		AIPcards.addAll(deck.draw(5));
		
		cardsToBeatDisplay = "Cards to beat: " + 
				cardsToBeat.get(0).toString() + " " + 
				cardsToBeat.get(1).toString() + " " + 
				cardsToBeat.get(2).toString() + " " + 
				cardsToBeat.get(3).toString() + " " + 
				cardsToBeat.get(4).toString() + "\n";
		
		AIPcardsDisplay = "AIP cards: " + 
				AIPcards.get(0).toString() + " " +
				AIPcards.get(1).toString() + " " +
				AIPcards.get(2).toString() + " " +
				AIPcards.get(3).toString() + " " +
				AIPcards.get(4).toString() + "\n";
		
		display();
	}

	public static String getWinner(List<Card> cardsToBeat, List<Card> AIPcards) {
		if(Hands.type(cardsToBeat) > Hands.type(AIPcards)) {
			return "AIP loses.";
		} else if (Hands.type(cardsToBeat) < Hands.type(AIPcards)) {
			return "AIP wins.";
		} else {
			return "Tie.";
		}
	}
	
	public static void display() {
		System.out.print(cardsToBeatDisplay);
		System.out.print(AIPcardsDisplay);
	}
}
