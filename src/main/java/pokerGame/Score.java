package pokerGame;

import java.util.*;

public class Score extends Hands {

	static public int score(List<Card> hand) {
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
				score = 1;
				break;
			default:
				score = -1;
				break;
		}
		
		return score;
	}
}
