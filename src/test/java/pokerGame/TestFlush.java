package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFlush extends TestCase {
	public TestFlush(String name) {
		super(name);
	}

	//test average flush hand
	//test method determining a flush hand
	public void testFlush() {
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "4"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "7"));
		Flush.add(new Card("S", "3"));
		assertTrue(Hands.isFlush(Flush));
		assertFalse(Hands.isRoyalFlush(Flush));
		assertFalse(Hands.isStraightFlush(Flush));
		assertFalse(Hands.isFourOfAKind(Flush));
		assertFalse(Hands.isFullHouse(Flush));
		assertFalse(Hands.isStraight(Flush));
		assertFalse(Hands.isThreeOfAKind(Flush));
		assertFalse(Hands.isTwoPair(Flush));
		assertFalse(Hands.isPair(Flush));
	}
	
	//test input with lowest possible flush
	public void testLowest() {
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("C", "2"));
		Flush.add(new Card("C", "3"));
		Flush.add(new Card("C", "4"));
		Flush.add(new Card("C", "5"));
		Flush.add(new Card("C", "7"));
		assertTrue(Hands.isFlush(Flush));
		assertFalse(Hands.isRoyalFlush(Flush));
		assertFalse(Hands.isStraightFlush(Flush));
		assertFalse(Hands.isFourOfAKind(Flush));
		assertFalse(Hands.isFullHouse(Flush));
		assertFalse(Hands.isStraight(Flush));
		assertFalse(Hands.isThreeOfAKind(Flush));
		assertFalse(Hands.isTwoPair(Flush));
		assertFalse(Hands.isPair(Flush));
	}
	
	//test input with highest possible flush
	public void testHandsFlush() {
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "Q"));
		Flush.add(new Card("S", "K"));
		Flush.add(new Card("S", "A"));
		assertTrue(Hands.isFlush(Flush));
		assertFalse(Hands.isRoyalFlush(Flush));
		assertFalse(Hands.isStraightFlush(Flush));
		assertFalse(Hands.isFourOfAKind(Flush));
		assertFalse(Hands.isFullHouse(Flush));
		assertFalse(Hands.isStraight(Flush));
		assertFalse(Hands.isThreeOfAKind(Flush));
		assertFalse(Hands.isTwoPair(Flush));
		assertFalse(Hands.isPair(Flush));
	}
}
