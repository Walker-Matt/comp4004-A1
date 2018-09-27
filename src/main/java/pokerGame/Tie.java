package pokerGame;

import java.util.List;

public class Tie {
	
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
