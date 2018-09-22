package pokerGame;

import java.util.*;

public class Hands {
	//Check for a Royal Flush
	protected static Boolean isRoyalFlush(List<Card> hand) {
		if(hand.get(0).getRank().equals("10") &&
			hand.get(1).getRank().equals("J") &&
			hand.get(2).getRank().equals("Q") &&
			hand.get(3).getRank().equals("K") &&
			hand.get(4).getRank().equals("A")) {
			Boolean is = true;
			String suit = hand.get(0).getSuit();
			for(Card c : hand) {
				if(!c.getSuit().equals(suit)) {
					is = false;
				}
			}
			if(is) {
				return true;
			}
		} 
		return false;
	}
	
	//Check for a Straight Flush
	protected static Boolean isStraightFlush(List<Card> hand) {
		Boolean is = true;
		int order = hand.get(0).getOrder();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getOrder() != (order + i) ) {
				is = false;
			}
		}
		String suit = hand.get(0).getSuit();
		for(Card c : hand) {
			if(!c.getSuit().equals(suit)) {
				is = false;
			}
		}
		if(is) {
			return true;
		}
		return false;
	}
}
