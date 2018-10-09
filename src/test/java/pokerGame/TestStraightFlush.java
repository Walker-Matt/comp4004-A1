package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightFlush extends TestCase {
	public TestStraightFlush(String name) {
		super(name);
	}

	//test average straight flush hand
	//test method determining a straight flush hand
	public void testStraightFlush() {
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("H", "5"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		assertTrue(Hands.isStraightFlush(straightFlush));
		assertFalse(Hands.isRoyalFlush(straightFlush));
		assertFalse(Hands.isFourOfAKind(straightFlush));
		assertFalse(Hands.isFullHouse(straightFlush));
		assertFalse(Hands.isThreeOfAKind(straightFlush));
		assertFalse(Hands.isTwoPair(straightFlush));
		assertFalse(Hands.isPair(straightFlush));
	}
	
	//test input with lowest possible straight flush
	public void testLowest() {
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("C", "2"));
		straightFlush.add(new Card("C", "3"));
		straightFlush.add(new Card("C", "4"));
		straightFlush.add(new Card("C", "5"));
		straightFlush.add(new Card("C", "6"));
		assertTrue(Hands.isStraightFlush(straightFlush));
		assertFalse(Hands.isRoyalFlush(straightFlush));
		assertFalse(Hands.isFourOfAKind(straightFlush));
		assertFalse(Hands.isFullHouse(straightFlush));
		assertFalse(Hands.isThreeOfAKind(straightFlush));
		assertFalse(Hands.isTwoPair(straightFlush));
		assertFalse(Hands.isPair(straightFlush));
	}
	
	//test input with highest possible straight flush
	public void testHighest() {
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("S", "9"));
		straightFlush.add(new Card("S", "10"));
		straightFlush.add(new Card("S", "J"));
		straightFlush.add(new Card("S", "Q"));
		straightFlush.add(new Card("S", "K"));
		assertTrue(Hands.isStraightFlush(straightFlush));
		assertFalse(Hands.isRoyalFlush(straightFlush));
		assertFalse(Hands.isFourOfAKind(straightFlush));
		assertFalse(Hands.isFullHouse(straightFlush));
		assertFalse(Hands.isThreeOfAKind(straightFlush));
		assertFalse(Hands.isTwoPair(straightFlush));
		assertFalse(Hands.isPair(straightFlush));
	}
}
