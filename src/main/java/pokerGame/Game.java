package pokerGame;

import java.util.*;

public class Game {
	static List<Deck> games;
	static List<Card> cardsToBeat;
	static List<Card> AIPcards;
	static String cardsToBeatDisplay;
	static String AIPcardsDisplay;
	static String handsDisplay;
	static String winnerDisplay;
	
	public static void main(String args[]) {
		games = ReadFile.read("cards/full_deck.txt");
		for(int i=1; i<games.size()+1; i++) {
			System.out.print("Game number " + i + ":\n");
			run(games.get(i-1));
			System.out.print("\n");
		}
	}
	
	public static void run(Deck deck) {
		cardsToBeat = new ArrayList<Card>();
		cardsToBeat.addAll(deck.draw(5));
		
		AIPcards = new ArrayList<Card>();
		AIPcards.addAll(deck.draw(5));
		
		winnerDisplay = getWinner() + "\n";
		
		handsDisplay = getHandsDisplay() + "\n";
		
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
	
	public static String getHandsDisplay() {
		return "AIP: " + getHandName(Hands.type(AIPcards)) + " vs. " +
				"CTB: " + getHandName(Hands.type(cardsToBeat));
	}
	
	public static String getHandName(int type) {
		switch(type) {
		case 10:
			return "Royal Flush";
		case 9:
			return "Straight Flush";
		case 8:
			return "Four of a Kind";
		case 7:
			return "Full House";
		case 6:
			return "Flush";
		case 5:
			return "Straight";
		case 4:
			return "Three of a Kind";
		case 3:
			return "Two Pair";
		case 2:
			return "One Pair";
		case 1:
			return "High Card";
		default:
			return "High Card";
		}
	}

	public static String getWinner() {
		if(Hands.type(cardsToBeat) > Hands.type(AIPcards)) {
			return "AIP loses.";
		} else if (Hands.type(cardsToBeat) < Hands.type(AIPcards)) {
			return "AIP wins.";
		} else {
			return Tie.settle(Hands.type(cardsToBeat), cardsToBeat, AIPcards);
		}
	}
	
	public static void display() {
		System.out.print(cardsToBeatDisplay);
		System.out.print(AIPcardsDisplay);
		System.out.print(handsDisplay);
		System.out.print(winnerDisplay);
	}
}
