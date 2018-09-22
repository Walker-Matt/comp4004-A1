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
		
		riverDisplay = "RIVER: " + river.get(0).getSuit() + river.get(0).getRank() + " " +
				river.get(1).getSuit() + river.get(1).getRank() + " " +
				river.get(2).getSuit() + river.get(2).getRank() + "\n";
		cardsToBeatDisplay = "Cards to beat: " + cardsToBeat.get(0).getSuit() + cardsToBeat.get(0).getRank() + 
				" " + cardsToBeat.get(1).getSuit() + cardsToBeat.get(1).getRank() + "\n";
		AIPcardsDisplay = "AIP cards: " + AIPcards.get(0).getSuit() + AIPcards.get(0).getRank() + " " +
		AIPcards.get(1).getSuit() + AIPcards.get(1).getRank() + "\n";
		
		display();
	}

	public static void display() {
		System.out.print(riverDisplay);
		System.out.print(cardsToBeatDisplay);
		System.out.print(AIPcardsDisplay);
	}
}
