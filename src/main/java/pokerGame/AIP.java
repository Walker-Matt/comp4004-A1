package pokerGame;

import java.util.*;

public class AIP {
	static List<Card> discard = new ArrayList<Card>();
	static List<Card> drawn;
	static List<Integer> removeIndex = new ArrayList<Integer>();
	
	//implements simple strategy for exchanging cards
 	public static List<Card> exchange(List<Card> hand) {
		if(Hands.type(hand) < 5) {
			if(oneAway(hand)) {
				discard.add(hand.get(removeIndex.get(0)));
				hand.remove(removeIndex.get(0));
				drawn = Game.deck.draw(1);
				hand.addAll(drawn);
			}
		}
		return hand;
	}
 	
 	public static boolean oneAway(List<Card> hand) {
 		//one away from a royal flush
 		if(almostRoyalFlush(hand)) {
 			String tempSuit = hand.get(0).getSuit();
 			String suit = "";
 			for(Card c : hand) {
 				if(!c.getSuit().equals(tempSuit)) {
 					tempSuit = c.getSuit();
 				} else {
 					suit = c.getSuit();
 				}
 			}
 			for(int i=0; i < hand.size(); i++) {
 				if(!hand.get(i).getSuit().equals(suit)) {
 					removeIndex.add(i);
 				}
 			}
 			return true;
 		}
 		return false;
 	}
 	
 	//returns true if one away from royal flush
 	public static boolean almostRoyalFlush(List<Card> hand) {
 		List<Card> parts = new ArrayList<Card>();
 		List<String> ranks = new ArrayList<String>();
 		ranks.add("10");
 		ranks.add("J");
 		ranks.add("Q");
 		ranks.add("K");
 		ranks.add("A");
 		for(Card c : hand) {
 			for(String s : ranks) {
 				if(c.getRank().equals(s)) {
 					parts.add(c);
 				}
 			}
 		}
 		String suit = parts.get(0).getSuit();
 		for(Card c : parts) {
 			if(!c.getSuit().equals(suit)) {
 				return false;
 			}
 		}
 		return true;
 	}
}
