package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightFlush extends TestCase {
	public TestStraightFlush(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_straight_flush.txt");

	//test average straight flush hand
	//test method determining a straight flush hand
	public void testStraightFlush() {
		List<Card> straightFlush = hands.get(0).getDeck();
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
		List<Card> straightFlush = hands.get(1).getDeck();
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
		List<Card> straightFlush = hands.get(2).getDeck();
		assertTrue(Hands.isStraightFlush(straightFlush));
		assertFalse(Hands.isRoyalFlush(straightFlush));
		assertFalse(Hands.isFourOfAKind(straightFlush));
		assertFalse(Hands.isFullHouse(straightFlush));
		assertFalse(Hands.isThreeOfAKind(straightFlush));
		assertFalse(Hands.isTwoPair(straightFlush));
		assertFalse(Hands.isPair(straightFlush));
	}
}
