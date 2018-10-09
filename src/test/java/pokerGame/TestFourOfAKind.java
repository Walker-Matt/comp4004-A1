package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFourOfAKind extends TestCase {
	public TestFourOfAKind(String name) {
		super(name);
	}
	
	//test average four of a kind hand
	//test method determining a four of a kind hand
	public void testFourOfAKind() {
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "4"));
		FourOfAKind.add(new Card("H", "4"));
		FourOfAKind.add(new Card("C", "4"));
		FourOfAKind.add(new Card("D", "4"));
		FourOfAKind.add(new Card("S", "3"));
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
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "2"));
		FourOfAKind.add(new Card("H", "2"));
		FourOfAKind.add(new Card("C", "2"));
		FourOfAKind.add(new Card("D", "2"));
		FourOfAKind.add(new Card("S", "3"));
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
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "A"));
		FourOfAKind.add(new Card("H", "A"));
		FourOfAKind.add(new Card("C", "A"));
		FourOfAKind.add(new Card("D", "A"));
		FourOfAKind.add(new Card("S", "K"));
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
