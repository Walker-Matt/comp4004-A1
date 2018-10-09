package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFourOfAKind extends TestCase {
	public TestFourOfAKind(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_four_of_a_kind.txt");
	
	//test average four of a kind hand
	//test method determining a four of a kind hand
	public void testFourOfAKind() {
		List<Card> FourOfAKind = hands.get(0).getDeck();
		assertTrue(Hands.isFourOfAKind(FourOfAKind));
		assertFalse(Hands.isRoyalFlush(FourOfAKind));
		assertFalse(Hands.isStraightFlush(FourOfAKind));
		assertFalse(Hands.isFullHouse(FourOfAKind));
		assertFalse(Hands.isFlush(FourOfAKind));
		assertFalse(Hands.isStraight(FourOfAKind));
		assertFalse(Hands.isThreeOfAKind(FourOfAKind));
		assertFalse(Hands.isTwoPair(FourOfAKind));
		assertFalse(Hands.isPair(FourOfAKind));
	}
	
	//test input with lowest possible four of a kind
	public void testlowest() {
		List<Card> FourOfAKind = hands.get(1).getDeck();
		assertTrue(Hands.isFourOfAKind(FourOfAKind));
		assertFalse(Hands.isRoyalFlush(FourOfAKind));
		assertFalse(Hands.isStraightFlush(FourOfAKind));
		assertFalse(Hands.isFullHouse(FourOfAKind));
		assertFalse(Hands.isFlush(FourOfAKind));
		assertFalse(Hands.isStraight(FourOfAKind));
		assertFalse(Hands.isThreeOfAKind(FourOfAKind));
		assertFalse(Hands.isTwoPair(FourOfAKind));
		assertFalse(Hands.isPair(FourOfAKind));
	}
	
	//test input with highest possible four of a kind
	public void testHighest() {
		List<Card> FourOfAKind = hands.get(2).getDeck();
		assertTrue(Hands.isFourOfAKind(FourOfAKind));
		assertFalse(Hands.isRoyalFlush(FourOfAKind));
		assertFalse(Hands.isStraightFlush(FourOfAKind));
		assertFalse(Hands.isFullHouse(FourOfAKind));
		assertFalse(Hands.isFlush(FourOfAKind));
		assertFalse(Hands.isStraight(FourOfAKind));
		assertFalse(Hands.isThreeOfAKind(FourOfAKind));
		assertFalse(Hands.isTwoPair(FourOfAKind));
		assertFalse(Hands.isPair(FourOfAKind));
	}
}
