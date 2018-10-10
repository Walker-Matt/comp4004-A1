package pokerGame;

import java.util.*;

public class AIP {
	static List<Card> discard;
	static List<Card> drawn;
	static List<Integer> removeIndex;
	
	private static class SortByOrder implements Comparator<Card> {
		//used to sort by Cards order (Aces high)
		public int compare(Card a, Card b) {
			return a.order - b.order;
		}
	}
	
	//implements simple strategy for exchanging cards
 	public static List<Card> exchange(List<Card> hand) {
 		discard = new ArrayList<Card>();
 		drawn = new ArrayList<Card>();
 		removeIndex = new ArrayList<Integer>();
		if(Hands.type(hand) < 5) {
			if(oneAway(hand)) {
				int index = removeIndex.get(0);
				discard.add(hand.get(index));
				hand.remove(index);
				drawn = Game.gameDeck.draw(1);
				hand.addAll(drawn);
				return hand;
			} else if(threeSameSuit(hand)) {
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
					hand.remove(index);
				}
				drawn = Game.gameDeck.draw(2);
				hand.addAll(drawn);
				return hand;
			} else if(threeSameRank(hand)) {
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
					hand.remove(index);
				}
				drawn = Game.gameDeck.draw(2);
				hand.addAll(drawn);
				return hand;
			}
		}
		return hand;
	}
 	
 	public static boolean threeSameRank(List<Card> hand) {
 		for(Card r : hand) {
 			String rank = r.getRank();
 			int count = 0;
	 		for(Card c : hand) {
	 			if(c.getRank().equals(rank)) {
	 				count++;
	 			}
	 		}
	 		if(count == 3) {
	 			for(int i=0; i<hand.size(); i++) {
	 				if(hand.get(i).getRank() != rank) {
	 					removeIndex.add(i);
	 				}
	 			}
	 			return true;
	 		}
 		}
 		return false;
 	}
 	
 	public static boolean threeSameSuit(List<Card> hand) {
 		for(Card s : hand) {
 			String suit = s.getSuit();
 			int count = 0;
	 		for(Card c : hand) {
	 			if(c.getSuit().equals(suit)) {
	 				count++;
	 			}
	 		}
	 		if(count == 3) {
	 			for(int i=0; i<hand.size(); i++) {
	 				if(hand.get(i).getSuit() != suit) {
	 					removeIndex.add(i);
	 				}
	 			}
	 			return true;
	 		}
 		}
 		return false;
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
 					return true;
 				}
 			}
 			for(int i=0; i < hand.size(); i++) {
 				if(!hand.get(i).getRank().equals("10") ||
 					!hand.get(i).getRank().equals("J") ||
 					!hand.get(i).getRank().equals("Q") ||
 					!hand.get(i).getRank().equals("K") ||
 					!hand.get(i).getRank().equals("A")) {
 					removeIndex.add(i);
 					return true;
 				}
 			}
 		} else if(almostStraightFlush(hand)) {
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
 					return true;
 				}
 			}
 			Card previous = hand.get(0);
 			int index = 0;
 			for(int i=1; i<hand.size(); i++) {
 				if(previous.getOrder() != hand.get(i).getOrder()-1) {
 					index = i-1;
 				}
 			}
 			removeIndex.add(index);
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
 		if(parts.size() == 5) {
	 		for(Card s : parts) {
	 			String suit = s.getSuit();
	 			int count = 0;
		 		for(Card c : parts) {
		 			if(c.getSuit().equals(suit)) {
		 				count++;
		 			}
		 		}
		 		if(count == 4) {
		 			return true;
		 		}
	 		}
 		} else if(parts.size() == 4) {
 			String suit = parts.get(0).getSuit();
 			for(Card c : parts) {
 				if(!c.getSuit().equals(suit)) {
 					return false;
 				}
 			}
 			return true;
 		} else {
 			return false;
 		}
 		return true;
 	}
 	
 	//returns true if one away from a straight flush
 	public static boolean almostStraightFlush(List<Card> hand) {
 		Collections.sort(hand, new SortByOrder());
 		int count = 0;
 		int index = 0;
 		if(hand.get(0).getOrder() != hand.get(1).getOrder()-1 &&
 		   hand.get(0).getOrder() != hand.get(2).getOrder()-2) {
 			count++;
 			index = 0;
 			for(int i=1; i<hand.size()-1; i++) {
 				if(hand.get(i).getOrder() != hand.get(i+1).getOrder()-1) {
 					return false;
 				}
 			}
 		}
 		if(hand.get(1).getOrder() != hand.get(2).getOrder()-1 &&
 		   hand.get(1).getOrder() != hand.get(3).getOrder()-2) {
 			count++;
 			index = 1;
 			for(int i=0; i<hand.size()-1; i++) {
 				if(i == 0) {
 					if(hand.get(i).getOrder() != hand.get(i+2).getOrder()-2) {
 	 					return false;
 	 				}
 				}
 				if(i != 1) {
 					if(hand.get(i).getOrder() != hand.get(i+1).getOrder()-1) {
 	 					return false;
 	 				}
 				}
 			}
 		}
 		if(hand.get(2).getOrder() != hand.get(3).getOrder()-1 &&
 		   hand.get(2).getOrder() != hand.get(4).getOrder()-2) {
 			count++;
 			index = 2;
 			for(int i=0; i<hand.size()-1; i++) {
 				if(i == 1) {
 					if(hand.get(i).getOrder() != hand.get(i+2).getOrder()-2) {
 	 					return false;
 	 				}
 				}
 				if(i != 2) {
 					if(hand.get(i).getOrder() != hand.get(i+1).getOrder()-1) {
 	 					return false;
 	 				}
 				}
 			}
 		}
 		if(hand.get(3).getOrder() != hand.get(2).getOrder()+1 &&
 		   hand.get(3).getOrder() != hand.get(1).getOrder()+2) {
 			count++;
 			index = 3;
 			for(int i=0; i<hand.size()-1; i++) {
 				if(i == 2) {
 					if(hand.get(i).getOrder() != hand.get(i+2).getOrder()-2) {
 	 					return false;
 	 				}
 				}
 				if(i != 3) {
 					if(hand.get(i).getOrder() != hand.get(i+1).getOrder()-1) {
 	 					return false;
 	 				}
 				}
 			}
 		}
 		if(hand.get(4).getOrder() != hand.get(3).getOrder()+1 &&
 		   hand.get(4).getOrder() != hand.get(2).getOrder()+2) {
 			count++;
 			index = 4;
 			for(int i=3; i>0; i--) {
				if(hand.get(i).getOrder() != hand.get(i-1).getOrder()+1) {
 					return false;
 				}
 			}
 		}
 		if(count == 1) {
 			String suit;
 			if(index != 0) {
 				suit = hand.get(0).getSuit();
 			} else {
 				suit = hand.get(1).getSuit();
 			}
	 		for(int i=0; i<hand.size(); i++) {
	 			if(hand.get(i).getSuit() != suit) {
	 				return false;
	 			}
	 		}
	 		return true;
 		} else if(count == 0) {
 			for(Card s : hand) {
	 			String suit = s.getSuit();
	 			int suitCount = 0;
		 		for(Card c : hand) {
		 			if(c.getSuit().equals(suit)) {
		 				suitCount++;
		 			}
		 		}
		 		if(suitCount == 4) {
		 			return true;
		 		}
	 		}
 		} else {
 			return false;
 		}
 		return true;
 	}
}
