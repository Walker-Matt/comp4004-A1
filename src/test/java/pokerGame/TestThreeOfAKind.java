package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestThreeOfAKind extends TestCase {
	public TestThreeOfAKind(String name) {
		super(name);
	}
	
	//test average three of a kind hand
	//test method determining a three of a kind hand
	public void testThreeOfAKind() {
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "4"));
		ThreeOfAKind.add(new Card("H", "4"));
		ThreeOfAKind.add(new Card("C", "4"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		assertTrue(Hands.isThreeOfAKind(ThreeOfAKind));
		assertFalse(Hands.isRoyalFlush(ThreeOfAKind));
		assertFalse(Hands.isStraightFlush(ThreeOfAKind));
		assertFalse(Hands.isFourOfAKind(ThreeOfAKind));
		assertFalse(Hands.isFullHouse(ThreeOfAKind));
		assertFalse(Hands.isFlush(ThreeOfAKind));
		assertFalse(Hands.isStraight(ThreeOfAKind));
		assertFalse(Hands.isTwoPair(ThreeOfAKind));
		assertFalse(Hands.isPair(ThreeOfAKind));	
	}
	
	//test input with lowest possible three of a kind
	public void testLowest() {
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "2"));
		ThreeOfAKind.add(new Card("H", "2"));
		ThreeOfAKind.add(new Card("C", "2"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		assertTrue(Hands.isThreeOfAKind(ThreeOfAKind));
		assertFalse(Hands.isRoyalFlush(ThreeOfAKind));
		assertFalse(Hands.isStraightFlush(ThreeOfAKind));
		assertFalse(Hands.isFourOfAKind(ThreeOfAKind));
		assertFalse(Hands.isFullHouse(ThreeOfAKind));
		assertFalse(Hands.isFlush(ThreeOfAKind));
		assertFalse(Hands.isStraight(ThreeOfAKind));
		assertFalse(Hands.isTwoPair(ThreeOfAKind));
		assertFalse(Hands.isPair(ThreeOfAKind));	
	}
	
	//test input with highest possible three of a kind
	public void testHighest() {
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "A"));
		ThreeOfAKind.add(new Card("H", "A"));
		ThreeOfAKind.add(new Card("C", "A"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		assertTrue(Hands.isThreeOfAKind(ThreeOfAKind));
		assertFalse(Hands.isRoyalFlush(ThreeOfAKind));
		assertFalse(Hands.isStraightFlush(ThreeOfAKind));
		assertFalse(Hands.isFourOfAKind(ThreeOfAKind));
		assertFalse(Hands.isFullHouse(ThreeOfAKind));
		assertFalse(Hands.isFlush(ThreeOfAKind));
		assertFalse(Hands.isStraight(ThreeOfAKind));
		assertFalse(Hands.isTwoPair(ThreeOfAKind));
		assertFalse(Hands.isPair(ThreeOfAKind));	
	}
}
