package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestThreeOfAKind extends TestCase {
	public TestThreeOfAKind(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_three_of_a_kind.txt");
	
	//test average three of a kind hand
	//test method determining a three of a kind hand
	public void testThreeOfAKind() {
		List<Card> ThreeOfAKind = hands.get(0).getDeck();
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
		List<Card> ThreeOfAKind = hands.get(1).getDeck();
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
		List<Card> ThreeOfAKind = hands.get(2).getDeck();
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
