package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTwoPair extends TestCase {
	public TestTwoPair(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_two_pair.txt");

	//test average two pair hand
	//test method determining a two pair hand
	public void testTwoPair() {
		List<Card> TwoPair = hands.get(0).getDeck();
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
		List<Card> TwoPair = hands.get(1).getDeck();
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
		List<Card> TwoPair = hands.get(2).getDeck();
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
