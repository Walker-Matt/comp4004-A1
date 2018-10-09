package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraight extends TestCase {
	public TestStraight(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_straight.txt");

	//test average straight hand
	//test method determining a straight hand
	public void testStraight() {
		List<Card> Straight = hands.get(0).getDeck();
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isRoyalFlush(Straight));
		assertFalse(Hands.isStraightFlush(Straight));
		assertFalse(Hands.isFourOfAKind(Straight));
		assertFalse(Hands.isFullHouse(Straight));
		assertFalse(Hands.isFlush(Straight));
		assertFalse(Hands.isThreeOfAKind(Straight));
		assertFalse(Hands.isTwoPair(Straight));
		assertFalse(Hands.isPair(Straight));
	}
	
	//test input with lowest possible straight
	public void testLowest() {
		List<Card> Straight = hands.get(1).getDeck();
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isRoyalFlush(Straight));
		assertFalse(Hands.isStraightFlush(Straight));
		assertFalse(Hands.isFourOfAKind(Straight));
		assertFalse(Hands.isFullHouse(Straight));
		assertFalse(Hands.isFlush(Straight));
		assertFalse(Hands.isThreeOfAKind(Straight));
		assertFalse(Hands.isTwoPair(Straight));
		assertFalse(Hands.isPair(Straight));
	}
	
	//test input with highest possible straight
	public void testHighest() {
		List<Card> Straight = hands.get(2).getDeck();
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isRoyalFlush(Straight));
		assertFalse(Hands.isStraightFlush(Straight));
		assertFalse(Hands.isFourOfAKind(Straight));
		assertFalse(Hands.isFullHouse(Straight));
		assertFalse(Hands.isFlush(Straight));
		assertFalse(Hands.isThreeOfAKind(Straight));
		assertFalse(Hands.isTwoPair(Straight));
		assertFalse(Hands.isPair(Straight));
	}
}
