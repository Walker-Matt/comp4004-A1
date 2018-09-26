package pokerGame;

import java.util.List;

public class Tie {

	protected static int highCard(List<Card> hand) {
		Card highCard = hand.get(0);
		for(Card c : hand) {
			if(c.getOrder() > highCard.getOrder()) {
				highCard = c;
			}
		}
		return highCard.getOrder();
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
