package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestRoyalFlush extends TestCase {
	public TestRoyalFlush(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_royal_flush.txt");

	//test average royal flush hand
	//test method determining a royal flush hand
	public void testRoyalFlush() {
		List<Card> royalFlush = hands.get(0).getDeck();
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
	
	//test input with lowest possible royal flush
	public void testLowest() {
		List<Card> royalFlush = hands.get(1).getDeck();
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
	
	//test input with highest possible royal flush
	public void testHighest() {
		List<Card> royalFlush = hands.get(2).getDeck();
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
}
