package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestHighCard extends TestCase {
	public TestHighCard(String name) {
		super(name);
	}
	
	//test average high card hand
	//test method determining a high card hand
	public void testHighCard() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		assertTrue(Hands.isHighCard(HighCard));
		assertFalse(Hands.isRoyalFlush(HighCard));
		assertFalse(Hands.isStraightFlush(HighCard));
		assertFalse(Hands.isFourOfAKind(HighCard));
		assertFalse(Hands.isFullHouse(HighCard));
		assertFalse(Hands.isFlush(HighCard));
		assertFalse(Hands.isStraight(HighCard));
		assertFalse(Hands.isThreeOfAKind(HighCard));
		assertFalse(Hands.isTwoPair(HighCard));
		assertFalse(Hands.isPair(HighCard));
	}
	
	//test input with lowest possible high card
	public void testLowest() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "2"));
		HighCard.add(new Card("H", "3"));
		HighCard.add(new Card("C", "4"));
		HighCard.add(new Card("D", "5"));
		HighCard.add(new Card("S", "7"));
		assertTrue(Hands.isHighCard(HighCard));
		assertFalse(Hands.isRoyalFlush(HighCard));
		assertFalse(Hands.isStraightFlush(HighCard));
		assertFalse(Hands.isFourOfAKind(HighCard));
		assertFalse(Hands.isFullHouse(HighCard));
		assertFalse(Hands.isFlush(HighCard));
		assertFalse(Hands.isStraight(HighCard));
		assertFalse(Hands.isThreeOfAKind(HighCard));
		assertFalse(Hands.isTwoPair(HighCard));
		assertFalse(Hands.isPair(HighCard));
	}
	
	//test input with highest possible high card
	public void testHighest() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "A"));
		assertTrue(Hands.isHighCard(HighCard));
		assertFalse(Hands.isRoyalFlush(HighCard));
		assertFalse(Hands.isStraightFlush(HighCard));
		assertFalse(Hands.isFourOfAKind(HighCard));
		assertFalse(Hands.isFullHouse(HighCard));
		assertFalse(Hands.isFlush(HighCard));
		assertFalse(Hands.isStraight(HighCard));
		assertFalse(Hands.isThreeOfAKind(HighCard));
		assertFalse(Hands.isTwoPair(HighCard));
		assertFalse(Hands.isPair(HighCard));
	}
}
