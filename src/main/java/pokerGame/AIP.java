package pokerGame;

import java.util.*;

public class AIP {
	static List<Card> discard;
	static List<Integer> removeIndex;
	
	//implements simple strategy for exchanging cards
 	public static List<Card> exchange(List<Card> hand) {
 		discard = new ArrayList<Card>();
 		removeIndex = new ArrayList<Integer>();
		if(Hands.type(hand) < 5) {
			if(oneAway(hand)) {
				int index = removeIndex.get(0);
				discard.add(hand.get(index));
				return hand;
			} else if(threeSameSuit(hand)) {
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
				}
				return hand;
			} else if(threeSameRank(hand)) {
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
				}
				return hand;
			} else if(threeCardSequence(hand)) {
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
				}
				return hand;
			} else if(twoPairs(hand)) {
				int index = removeIndex.get(0);
				discard.add(hand.get(index));
				return hand;
			} else if(onePair(hand)) {
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
				}
				return hand;
			} else {
				twoHighest(hand);
				for(int i=removeIndex.size()-1; i>=0; i--) {
					int index = removeIndex.get(i);
					discard.add(hand.get(index));
				}
				return hand;
			}
		}
		return hand;
	}
 	
 	public static boolean twoHighest(List<Card> hand) {
 		removeIndex.add(0);
 		removeIndex.add(1);
 		removeIndex.add(2);
 		return true;
 	}
 	
 	public static boolean onePair(List<Card> hand) {
 		int pairs = 0;
 		String pair = "";
 		for(int i=0; i<hand.size(); i++) {
 			int count = 1;
 			for(int j=i; j<hand.size(); j++) {
 				if(i != j) {
 					if(hand.get(i).getRank().equals(hand.get(j).getRank())) {
 						count++;
 					}
 				}
 			}
 			if(count > 2) {
 				return false;
 			} else if(count == 2) {
 				pairs++;
 				pair = hand.get(i).getRank();
 			}
 		}
 		if(pairs == 1) {
 			for(int i=0; i<hand.size(); i++) {
 				if(!hand.get(i).getRank().equals(pair)) {
 					removeIndex.add(i);
 				}
 			}
 			return true;
 		} else {
 			return false;
 		}
 	}
 	
 	public static boolean twoPairs(List<Card> hand) {
 		int pairs = 0;
 		String pair1 = "";
 		String pair2 = "";
 		for(int i=0; i<hand.size(); i++) {
 			int count = 1;
 			for(int j=i; j<hand.size(); j++) {
 				if(i != j) {
 					if(hand.get(i).getRank().equals(hand.get(j).getRank())) {
 						count++;
 					}
 				}
 			}
 			if(count > 2) {
 				return false;
 			} else if(count == 2) {
 				pairs++;
 				if(pair1.equals("")) {
 					pair1 = hand.get(i).getRank();
 				} else {
 					pair2 = hand.get(i).getRank();
 				}
 			}
 		}
 		if(pairs == 2) {
 			for(int i=0; i<hand.size(); i++) {
 				if(!hand.get(i).getRank().equals(pair1) ||
 				   !hand.get(i).getRank().equals(pair2)) {
 					removeIndex.add(i);
 					return true;
 				}
 			}
 		}
 		return false;
 	}
 	
 	public static boolean threeCardSequence(List<Card> hand) {
 		Card previous = hand.get(0);
 		int count = 1;
 		for(int i=1; i<hand.size(); i++) {
 			if(previous.getOrder() == hand.get(i).getOrder()-1) {
 				previous = hand.get(i);
 				count++;
 			} else {
 				previous = hand.get(i);
 				count = 1;
 			}
 			if(count == 3) {
 				if(i == 4) {
 					removeIndex.add(0);
 					removeIndex.add(1);
 				} else {
	 				if(previous.getOrder() != hand.get(i).getOrder()-2) {
	 					if(i == 2) {
	 						removeIndex.add(3);
	 						removeIndex.add(4);
	 					} else if(i == 3) {
	 						removeIndex.add(0);
	 						removeIndex.add(4);
	 					}
	 					return true;
	 				}
	 				return true;
 				}
 			}
 		}
 		
 		return false;
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
