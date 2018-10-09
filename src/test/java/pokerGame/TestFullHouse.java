package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFullHouse extends TestCase {
	public TestFullHouse(String name) {
		super(name);
	}

	//test average full house hand
	//test method determining a full house hand
	public void testFullHouse() {
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "4"));
		FullHouse.add(new Card("H", "4"));
		FullHouse.add(new Card("C", "4"));
		FullHouse.add(new Card("D", "7"));
		FullHouse.add(new Card("S", "7"));
		assertTrue(Hands.isFullHouse(FullHouse));
		assertFalse(Hands.isRoyalFlush(FullHouse));
		assertFalse(Hands.isStraightFlush(FullHouse));
		assertFalse(Hands.isFourOfAKind(FullHouse));
		assertFalse(Hands.isFlush(FullHouse));
		assertFalse(Hands.isStraight(FullHouse));
		assertFalse(Hands.isThreeOfAKind(FullHouse));
		assertFalse(Hands.isTwoPair(FullHouse));
		assertFalse(Hands.isPair(FullHouse));
	}
	
	//test input with lowest possible full house
	public void testLowest() {
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "2"));
		FullHouse.add(new Card("H", "2"));
		FullHouse.add(new Card("C", "2"));
		FullHouse.add(new Card("D", "3"));
		FullHouse.add(new Card("S", "3"));
		assertTrue(Hands.isFullHouse(FullHouse));
		assertFalse(Hands.isRoyalFlush(FullHouse));
		assertFalse(Hands.isStraightFlush(FullHouse));
		assertFalse(Hands.isFourOfAKind(FullHouse));
		assertFalse(Hands.isFlush(FullHouse));
		assertFalse(Hands.isStraight(FullHouse));
		assertFalse(Hands.isThreeOfAKind(FullHouse));
		assertFalse(Hands.isTwoPair(FullHouse));
		assertFalse(Hands.isPair(FullHouse));
	}
	
	//test input with highest possible full house
	public void testHighest() {
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "A"));
		FullHouse.add(new Card("H", "A"));
		FullHouse.add(new Card("C", "A"));
		FullHouse.add(new Card("D", "K"));
		FullHouse.add(new Card("S", "K"));
		assertTrue(Hands.isFullHouse(FullHouse));
		assertFalse(Hands.isRoyalFlush(FullHouse));
		assertFalse(Hands.isStraightFlush(FullHouse));
		assertFalse(Hands.isFourOfAKind(FullHouse));
		assertFalse(Hands.isFlush(FullHouse));
		assertFalse(Hands.isStraight(FullHouse));
		assertFalse(Hands.isThreeOfAKind(FullHouse));
		assertFalse(Hands.isTwoPair(FullHouse));
		assertFalse(Hands.isPair(FullHouse));
	}
}
