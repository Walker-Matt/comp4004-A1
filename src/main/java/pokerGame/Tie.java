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
}
