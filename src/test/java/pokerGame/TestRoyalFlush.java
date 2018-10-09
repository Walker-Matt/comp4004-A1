package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestRoyalFlush extends TestCase {
	public TestRoyalFlush(String name) {
		super(name);
	}

	//test average royal flush hand
	//test method determining a royal flush hand
	public void testRoyalFlush() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
	
	//test input with lowest possible royal flush
	public void testLowest() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("C", "10"));
		royalFlush.add(new Card("C", "J"));
		royalFlush.add(new Card("C", "Q"));
		royalFlush.add(new Card("C", "K"));
		royalFlush.add(new Card("C", "A"));
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
	
	//test input with highest possible royal flush
	public void testHighest() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("S", "10"));
		royalFlush.add(new Card("S", "J"));
		royalFlush.add(new Card("S", "Q"));
		royalFlush.add(new Card("S", "K"));
		royalFlush.add(new Card("S", "A"));
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
}
