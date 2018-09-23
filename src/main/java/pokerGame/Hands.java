package pokerGame;

import java.util.*;

public class Hands {
	private static class SortByOrder implements Comparator<Card> {
		//used to sort by Cards order (Aces high)
		public int compare(Card a, Card b) {
			return a.order - b.order;
		}
	}
	
	static public String type(List<Card> hand) {
		//sort hand to make identifying easier
		//because of this, every hand check assumes a sorted hand
		Collections.sort(hand, new SortByOrder());
		
		//Royal Flush
		if(isRoyalFlush(hand)) {
			return "Royal Flush";
		}
		
		//Straight Flush
		if(isStraightFlush(hand)) {
			return "Straight Flush";
		}
		
		//Four of a Kind
		if(isFourOfAKind(hand)) {
			return "Four of a Kind";
		}
		
		//Full House
		if(isFullHouse(hand)) {
			return "Full House";
		}
		
		//Flush
		if(isFlush(hand)) {
			return "Flush";
		}
		
		//Straight
		if(isStraight(hand)) {
			return "Straight";
		}
		
		//Three of a Kind
		if(isThreeOfAKind(hand)) {
			return "Three of a Kind";
		}
		
		//Two Pair
		if(isTwoPair(hand)) {
			return "Two Pair";
		}
		
		//Pair
		if(isPair(hand)) {
			return "Pair";
		}
		
		//High Card
		if(isHighCard(hand)) {
			return "High Card";
		}
		
		//Shouldn't be possible
		return "Nothing.";
	}
	
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
	
	//Check for a Four of a Kind
	protected static Boolean isFourOfAKind(List<Card> hand) {
		int same = 1;
		String rank = hand.get(0).getRank();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getRank().equals(rank)) {
				same += 1;
			} else {
				rank = hand.get(i).getRank();
				if(same != 4) {
					same = 1;
				}
			}
		}
		if(same == 4) {
			return true;
		}
		return false;
	}
	
	//Check for a Full House
	protected static Boolean isFullHouse(List<Card> hand) {
		int same1 = 1;
		int same2 = 1;
		int changed = 0;
		String rank = hand.get(0).getRank();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getRank().equals(rank)) {
				if(changed == 0) {
					same1 += 1;
				} else if(changed == 1) {
					same2 += 1;
				} else {
					return false;
				}
			} else {
				rank = hand.get(i).getRank();
				changed += 1;
			}
		}
		if((same1 == 2 && same2 == 3) ||
			(same1 == 3 && same2 == 2)) {
			return true;
		}
		return false;
	}
	
	//Check for a Flush
	protected static Boolean isFlush(List<Card> hand) {
		String suit = hand.get(0).getSuit();
		for(int i=1; i<hand.size(); i++) {
			if(!hand.get(i).getSuit().equals(suit)) {
				return false;
			}
		}
		return true;
	}
	
	//Check for a Straight
	protected static Boolean isStraight(List<Card> hand) {
		Boolean is = true;
		int order = hand.get(0).getOrder();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getOrder() != (order + i) ) {
				is = false;
			}
		}
		if(is) {
			return true;
		}
		return false;
	}
	
	//Check for a Three of a Kind
	protected static Boolean isThreeOfAKind(List<Card> hand) {
		int same = 1;
		String rank = hand.get(0).getRank();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getRank().equals(rank)) {
				same += 1;
			} else {
				rank = hand.get(i).getRank();
				if(same != 3) {
					same = 1;
				}
			}
		}
		if(same == 3) {
			return true;
		}
		return false;
	}
	
	//Check for a Two Pair
	protected static Boolean isTwoPair(List<Card> hand) {
		int pair1 = 1;
		int pair2 = 1;
		int changed = 0;
		String rank = hand.get(0).getRank();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getRank().equals(rank)) {
				if(changed == 0) {
					pair1 += 1;
				} else if(changed == 1 && pair1 == 1) {
					pair1 += 1;
				} else if(changed == 1 && pair1 == 2) {
					pair2 += 1;
				} else if (changed == 2 && pair2 == 1) {
					pair2 += 1;
				} else if (changed == 2 && pair2 == 2) {
					return false;
				}
			} else {
				rank = hand.get(i).getRank();
				changed += 1;
			}
		}
		if((pair1 == 2 && pair2 == 2)) {
			return true;
		}
		return false;
	}
	
	//Check for a Pair
	protected static Boolean isPair(List<Card> hand) {
		int pair = 1;
		int changed = 0;
		String rank = hand.get(0).getRank();
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i).getRank().equals(rank)) {
				pair += 1;
			} else {
				rank = hand.get(i).getRank();
				changed += 1;
			}
		}
		if(pair == 2) {
			return true;
		}
		return false;
	}
	
	//Check for a High Card 
	//(Obviously this will always return true)
	protected static Boolean isHighCard(List<Card> hand) {
		return true;
	}
}
