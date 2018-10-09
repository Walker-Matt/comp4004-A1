package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTwoPair extends TestCase {
	public TestTwoPair(String name) {
		super(name);
	}

	//test average two pair hand
	//test method determining a two pair hand
	public void testTwoPair() {
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "4"));
		TwoPair.add(new Card("H", "4"));
		TwoPair.add(new Card("C", "9"));
		TwoPair.add(new Card("D", "9"));
		TwoPair.add(new Card("S", "3"));
		assertTrue(Hands.isTwoPair(TwoPair));
		assertFalse(Hands.isRoyalFlush(TwoPair));
		assertFalse(Hands.isStraightFlush(TwoPair));
		assertFalse(Hands.isFourOfAKind(TwoPair));
		assertFalse(Hands.isFullHouse(TwoPair));
		assertFalse(Hands.isFlush(TwoPair));
		assertFalse(Hands.isStraight(TwoPair));
		assertFalse(Hands.isThreeOfAKind(TwoPair));
		assertFalse(Hands.isPair(TwoPair));
	}
	
	//test input with lowest possible two pair
	public void testLowest() {
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "2"));
		TwoPair.add(new Card("H", "2"));
		TwoPair.add(new Card("C", "3"));
		TwoPair.add(new Card("D", "3"));
		TwoPair.add(new Card("S", "4"));
		assertTrue(Hands.isTwoPair(TwoPair));
		assertFalse(Hands.isRoyalFlush(TwoPair));
		assertFalse(Hands.isStraightFlush(TwoPair));
		assertFalse(Hands.isFourOfAKind(TwoPair));
		assertFalse(Hands.isFullHouse(TwoPair));
		assertFalse(Hands.isFlush(TwoPair));
		assertFalse(Hands.isStraight(TwoPair));
		assertFalse(Hands.isThreeOfAKind(TwoPair));
		assertFalse(Hands.isPair(TwoPair));
	}
	
	//test input with highest possible two pair
	public void testHighest() {
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "K"));
		TwoPair.add(new Card("H", "K"));
		TwoPair.add(new Card("C", "A"));
		TwoPair.add(new Card("D", "A"));
		TwoPair.add(new Card("S", "3"));
		assertTrue(Hands.isTwoPair(TwoPair));
		assertFalse(Hands.isRoyalFlush(TwoPair));
		assertFalse(Hands.isStraightFlush(TwoPair));
		assertFalse(Hands.isFourOfAKind(TwoPair));
		assertFalse(Hands.isFullHouse(TwoPair));
		assertFalse(Hands.isFlush(TwoPair));
		assertFalse(Hands.isStraight(TwoPair));
		assertFalse(Hands.isThreeOfAKind(TwoPair));
		assertFalse(Hands.isPair(TwoPair));
	}
}
