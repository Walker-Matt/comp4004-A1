package pokerGame;

import java.util.List;

public class Tie {
	
	protected static String settleFlush(List<Card> cardsToBeat, List<Card> AIPcards) {
		Boolean sameHighCard = true;
		while(sameHighCard) {
			if(highCard(cardsToBeat).getOrder() > highCard(AIPcards).getOrder()) {
				sameHighCard = false;
				return "AIP loses.";
			} else if (highCard(cardsToBeat).getOrder() < highCard(AIPcards).getOrder()) {
				sameHighCard = false;
				return "AIP wins.";
			} else {
				if(cardsToBeat.size() > 1) {
					cardsToBeat.remove(highCard(cardsToBeat));
				} else {
					break;
				}
				if(AIPcards.size() > 1) {
					AIPcards.remove(highCard(AIPcards));
				} else {
					break;
				}
			}
		}
		if(suitScore(highCard(cardsToBeat)) > suitScore(highCard(AIPcards))) {
			return "AIP loses.";
		} else {
			return "AIP wins.";
		}
	}
	
	protected static String settleTwoPair(List<Card> cardsToBeat, List<Card> AIPcards) {
		if(twoPair(cardsToBeat).getOrder() > twoPair(AIPcards).getOrder()) {
			return "AIP loses.";
		} else if (twoPair(cardsToBeat).getOrder() < twoPair(AIPcards).getOrder()) {
			return "AIP wins.";
		} else {
			if(suitScore(twoPair(cardsToBeat)) > suitScore(twoPair(AIPcards))) {
				return "AIP loses.";
			} else {
				return "AIP wins.";
			}
		}
	}
	
	protected static String settlePair(List<Card> cardsToBeat, List<Card> AIPcards) {
		if(pair(cardsToBeat).getOrder() > pair(AIPcards).getOrder()) {
			return "AIP loses.";
		} else if (pair(cardsToBeat).getOrder() < pair(AIPcards).getOrder()) {
			return "AIP wins.";
		} else {
			if(suitScore(pair(cardsToBeat)) > suitScore(pair(AIPcards))) {
				return "AIP loses.";
			} else {
				return "AIP wins.";
			}
		}
	}
	
	protected static String settleHighCard(List<Card> cardsToBeat, List<Card> AIPcards) {
		if(highCard(cardsToBeat).getOrder() > highCard(AIPcards).getOrder()) {
			return "AIP loses.";
		} else if (highCard(cardsToBeat).getOrder() < highCard(AIPcards).getOrder()) {
			return "AIP wins.";
		} else {
			if(suitScore(highCard(cardsToBeat)) > suitScore(highCard(AIPcards))) {
				return "AIP loses.";
			} else {
				return "AIP wins.";
			}
		}
	}
	
	protected static Card twoPair(List<Card> hand) {
		Card firstPair = hand.get(0);
		for(int i=1; i < hand.size(); i++) {
			if(hand.get(i).getRank() == firstPair.getRank()) {
				break;
			} else {
				firstPair = hand.get(i);
			}
		}
		Card secondPair = hand.get(0);
		for(int i=1; i < hand.size(); i++) {
			if(hand.get(i).getRank() == secondPair.getRank() &&
				hand.get(i).getRank() != firstPair.getRank()) {
				break;
			} else {
				secondPair = hand.get(i);
			}
		}
		if(firstPair.getOrder() > secondPair.getOrder()) {
			return firstPair;
		} else {
			return secondPair;
		}
	}
	
	protected static Card pair(List<Card> hand) {
		Card pairCard = hand.get(0);
		for(int i=1; i < hand.size(); i++) {
			if(hand.get(i).getRank() == pairCard.getRank()) {
				break;
			} else {
				pairCard = hand.get(i);
			}
		}
		return pairCard;
	}

	protected static Card highCard(List<Card> hand) {
		Card highCard = hand.get(0);
		for(Card c : hand) {
			if(c.getOrder() > highCard.getOrder()) {
				highCard = c;
			}
		}
		return highCard;
	}
	
	protected static int suitScore(Card card) {
		if(card.getSuit().equals("S")) {
			return 4;
		} else if(card.getSuit().equals("H")) {
			return 3;
		} else if(card.getSuit().equals("D")) {
			return 2;
		} else {
			return 1;
		}
	}
}
