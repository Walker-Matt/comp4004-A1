package pokerGame;

import java.util.*;

public class Score extends Hands {

	protected static int score(List<Card> hand) {
		int score = 0;
		String type = type(hand);
		switch(type) {
			case "Royal Flush": 
				score = 139;
				break;
			case "Straight Flush":
				score = 125;
				break;
			case "Four of a Kind":
				score = 111;
				break;
			case "Full House":
				score = 84;
				break;
			case "Flush":
				score = 79;
				break;
			case "Straight":
				score = 69;
				break;
			case "Three of a Kind":
				score = 55;
				break;
			case "Two Pair":
				score = 28;
				break;
			case "Pair":
				score = 14;
				break;
			case "High Card":
				score = highCardScore(hand);
				break;
			default:
				score = -1;
				break;
		}
		
		return score;
	}
	
	protected static int highCardScore(List<Card> hand) {
		Card highCard = hand.get(0);
		for(Card c : hand) {
			if(c.getOrder() > highCard.getOrder()) {
				highCard = c;
			}
		}
		return highCard.getOrder();
	}
	
	protected static int suitScore(String suit) {
		if(suit.equals("S")) {
			return 4;
		} else if(suit.equals("H")) {
			return 3;
		} else if(suit.equals("D")) {
			return 2;
		} else {
			return 1;
		}
	}
}
