package pokerGame;

import java.util.*;

public class Game {
	static List<Deck> games;
	static Deck gameDeck;
	static List<Card> cardsToBeat;
	static List<Card> AIPcards;
	static List<Card> AIPexchange;
	static String cardsToBeatDisplay;
	static String AIPcardsDisplay;
	static String AIPExchangeDisplay;
	static String AIPcardsAfterDisplay;
	static String handsDisplay;
	static String winnerDisplay;
	
	public static void main(String args[]) {
		games = ReadFile.read("cards/full_deck.txt");
		games.get(0).shuffle();           //REMOVE FOR DEMO!!!
		for(int i=1; i<games.size()+1; i++) {
			System.out.print("Game number " + i + ":\n");
			run(games.get(i-1));
			System.out.print("\n");
		}
	}
	
	public static void run(Deck deck) {
		gameDeck = deck;
		
		cardsToBeat = new ArrayList<Card>();
		cardsToBeat.addAll(gameDeck.draw(5));
		
		AIPcards = new ArrayList<Card>();
		AIPcards.addAll(gameDeck.draw(5));
		
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
		
		AIP.exchange(AIPcards);
		if(AIP.removeIndex.size() != 0) {
			for(int i=AIP.removeIndex.size()-1; i>=0; i--) {
				int index = AIP.removeIndex.get(i);
				AIPcards.remove(index);
				AIPexchange = new ArrayList<Card>();
				List<Card> newCard = gameDeck.draw(1);
				AIPexchange.add(newCard.get(0));
				AIPcards.add(newCard.get(0));
			}
		}
		
		AIPExchangeDisplay = getAIPExchangeDisplay() + "\n";
		
		AIPcardsAfterDisplay = "AIP cards after: " + 
				AIPcards.get(0).toString() + " " +
				AIPcards.get(1).toString() + " " +
				AIPcards.get(2).toString() + " " +
				AIPcards.get(3).toString() + " " +
				AIPcards.get(4).toString() + "\n";
		
		handsDisplay = getHandsDisplay() + "\n";
		
		winnerDisplay = getWinner() + "\n";
		
		display();
	}
	
	public static String getAIPExchangeDisplay() {
		if(AIP.discard.size() == 0) {
			return "AIP exchanges nothing.";
		} else {
			String discard = "";
			for(Card c : AIP.discard) {
				discard = discard + " " + c.toString();
			}
			String drawn = "";
			for(Card c : AIPexchange) {
				drawn = drawn + " " + c.toString();
			}
			
			return "AIP exchanges:" + 
				discard + " for" + drawn;
		}
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
		System.out.print(AIPExchangeDisplay);
		System.out.print(AIPcardsAfterDisplay);
		System.out.print(handsDisplay);
		System.out.print(winnerDisplay);
	}
}
