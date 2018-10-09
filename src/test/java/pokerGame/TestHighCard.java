package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestHighCard extends TestCase {
	public TestHighCard(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_high_card.txt");
	
	//test average high card hand
	//test method determining a high card hand
	public void testHighCard() {
		List<Card> HighCard = hands.get(0).getDeck();
		assertTrue(Hands.isHighCard(HighCard));
		assertFalse(Hands.isRoyalFlush(HighCard));
		assertFalse(Hands.isStraightFlush(HighCard));
		assertFalse(Hands.isFourOfAKind(HighCard));
		assertFalse(Hands.isFullHouse(HighCard));
		assertFalse(Hands.isFlush(HighCard));
		assertFalse(Hands.isStraight(HighCard));
		assertFalse(Hands.isThreeOfAKind(HighCard));
		assertFalse(Hands.isTwoPair(HighCard));
		assertFalse(Hands.isPair(HighCard));
	}
	
	//test input with lowest possible high card
	public void testLowest() {
		List<Card> HighCard = hands.get(1).getDeck();
		assertTrue(Hands.isHighCard(HighCard));
		assertFalse(Hands.isRoyalFlush(HighCard));
		assertFalse(Hands.isStraightFlush(HighCard));
		assertFalse(Hands.isFourOfAKind(HighCard));
		assertFalse(Hands.isFullHouse(HighCard));
		assertFalse(Hands.isFlush(HighCard));
		assertFalse(Hands.isStraight(HighCard));
		assertFalse(Hands.isThreeOfAKind(HighCard));
		assertFalse(Hands.isTwoPair(HighCard));
		assertFalse(Hands.isPair(HighCard));
	}
	
	//test input with highest possible high card
	public void testHighest() {
		List<Card> HighCard = hands.get(2).getDeck();
		assertTrue(Hands.isHighCard(HighCard));
		assertFalse(Hands.isRoyalFlush(HighCard));
		assertFalse(Hands.isStraightFlush(HighCard));
		assertFalse(Hands.isFourOfAKind(HighCard));
		assertFalse(Hands.isFullHouse(HighCard));
		assertFalse(Hands.isFlush(HighCard));
		assertFalse(Hands.isStraight(HighCard));
		assertFalse(Hands.isThreeOfAKind(HighCard));
		assertFalse(Hands.isTwoPair(HighCard));
		assertFalse(Hands.isPair(HighCard));
	}
}
