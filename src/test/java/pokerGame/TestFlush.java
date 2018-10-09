package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFlush extends TestCase {
	public TestFlush(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_flush.txt");

	//test average flush hand
	//test method determining a flush hand
	public void testFlush() {
		List<Card> Flush = hands.get(0).getDeck();
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
		List<Card> Flush = hands.get(1).getDeck();
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
	public void testHighest() {
		List<Card> Flush = hands.get(1).getDeck();
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
