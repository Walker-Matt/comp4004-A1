package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestOnePair extends TestCase {
	public TestOnePair(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_one_pair.txt");
	
	//test average one pair hand
	//test method determining a one pair hand
	public void testOnePair() {
		List<Card> Pair = hands.get(0).getDeck();
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
		List<Card> Pair = hands.get(1).getDeck();
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
		List<Card> Pair = hands.get(2).getDeck();
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
