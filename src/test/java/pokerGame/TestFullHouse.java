package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFullHouse extends TestCase {
	public TestFullHouse(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_full_house.txt");

	//test average full house hand
	//test method determining a full house hand
	public void testFullHouse() {
		List<Card> FullHouse = hands.get(0).getDeck();
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
		List<Card> FullHouse = hands.get(1).getDeck();
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
		List<Card> FullHouse = hands.get(2).getDeck();
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
