package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraight extends TestCase {
	public TestStraight(String name) {
		super(name);
	}

	//test average straight hand
	//test method determining a straight hand
	public void testStraight() {
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "4"));
		Straight.add(new Card("H", "5"));
		Straight.add(new Card("C", "6"));
		Straight.add(new Card("D", "7"));
		Straight.add(new Card("S", "8"));
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isRoyalFlush(Straight));
		assertFalse(Hands.isStraightFlush(Straight));
		assertFalse(Hands.isFourOfAKind(Straight));
		assertFalse(Hands.isFullHouse(Straight));
		assertFalse(Hands.isFlush(Straight));
		assertFalse(Hands.isThreeOfAKind(Straight));
		assertFalse(Hands.isTwoPair(Straight));
		assertFalse(Hands.isPair(Straight));
	}
	
	//test input with lowest possible straight
	public void testLowest() {
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "2"));
		Straight.add(new Card("H", "3"));
		Straight.add(new Card("C", "4"));
		Straight.add(new Card("D", "5"));
		Straight.add(new Card("S", "6"));
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isRoyalFlush(Straight));
		assertFalse(Hands.isStraightFlush(Straight));
		assertFalse(Hands.isFourOfAKind(Straight));
		assertFalse(Hands.isFullHouse(Straight));
		assertFalse(Hands.isFlush(Straight));
		assertFalse(Hands.isThreeOfAKind(Straight));
		assertFalse(Hands.isTwoPair(Straight));
		assertFalse(Hands.isPair(Straight));
	}
	
	//test input with highest possible straight
	public void testHighest() {
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "10"));
		Straight.add(new Card("H", "J"));
		Straight.add(new Card("C", "Q"));
		Straight.add(new Card("D", "K"));
		Straight.add(new Card("S", "A"));
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isRoyalFlush(Straight));
		assertFalse(Hands.isStraightFlush(Straight));
		assertFalse(Hands.isFourOfAKind(Straight));
		assertFalse(Hands.isFullHouse(Straight));
		assertFalse(Hands.isFlush(Straight));
		assertFalse(Hands.isThreeOfAKind(Straight));
		assertFalse(Hands.isTwoPair(Straight));
		assertFalse(Hands.isPair(Straight));
	}
}
