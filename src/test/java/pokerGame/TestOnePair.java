package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestOnePair extends TestCase {
	public TestOnePair(String name) {
		super(name);
	}
	
	//test average one pair hand
	//test method determining a one pair hand
	public void testOnePair() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		assertTrue(Hands.isPair(Pair));
		assertFalse(Hands.isRoyalFlush(Pair));
		assertFalse(Hands.isStraightFlush(Pair));
		assertFalse(Hands.isFourOfAKind(Pair));
		assertFalse(Hands.isFullHouse(Pair));
		assertFalse(Hands.isFlush(Pair));
		assertFalse(Hands.isStraight(Pair));
		assertFalse(Hands.isThreeOfAKind(Pair));
		assertFalse(Hands.isTwoPair(Pair));
	}
	
	//test input with lowest possible one pair
	public void testLowest() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "2"));
		Pair.add(new Card("H", "2"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		assertTrue(Hands.isPair(Pair));
		assertFalse(Hands.isRoyalFlush(Pair));
		assertFalse(Hands.isStraightFlush(Pair));
		assertFalse(Hands.isFourOfAKind(Pair));
		assertFalse(Hands.isFullHouse(Pair));
		assertFalse(Hands.isFlush(Pair));
		assertFalse(Hands.isStraight(Pair));
		assertFalse(Hands.isThreeOfAKind(Pair));
		assertFalse(Hands.isTwoPair(Pair));
	}
	
	//test input with highest possible one pair
	public void testHighest() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "A"));
		Pair.add(new Card("H", "A"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		assertTrue(Hands.isPair(Pair));
		assertFalse(Hands.isRoyalFlush(Pair));
		assertFalse(Hands.isStraightFlush(Pair));
		assertFalse(Hands.isFourOfAKind(Pair));
		assertFalse(Hands.isFullHouse(Pair));
		assertFalse(Hands.isFlush(Pair));
		assertFalse(Hands.isStraight(Pair));
		assertFalse(Hands.isThreeOfAKind(Pair));
		assertFalse(Hands.isTwoPair(Pair));
	}
}
