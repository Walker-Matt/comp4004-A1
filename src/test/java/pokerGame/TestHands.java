package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestHands extends TestCase {
	public TestHands(String name) {
		super(name);
	}
	
	//test check for a Royal Flush
	public void testHandRoyalFlush() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		assertTrue(Hands.isRoyalFlush(royalFlush));
	}
	
	//test check for a Straight Flush
	//test check for not a Royal Flush
	public void testHandStraightFlush() {
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("H", "5"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		assertTrue(Hands.isStraightFlush(straightFlush));
		assertFalse(Hands.isRoyalFlush(straightFlush));
	}
	
	//test check for a Four of a Kind
	//test check for not a Straight Flush
	public void testHandFourOfAKind() {
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "4"));
		FourOfAKind.add(new Card("H", "4"));
		FourOfAKind.add(new Card("C", "4"));
		FourOfAKind.add(new Card("D", "4"));
		FourOfAKind.add(new Card("S", "3"));
		assertTrue(Hands.isFourOfAKind(FourOfAKind));
		assertFalse(Hands.isStraightFlush(FourOfAKind));
	}
	
	//test check for a Full House
	//test check for not a Four of a Kind
	public void testHandFullHouse() {
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "4"));
		FullHouse.add(new Card("H", "4"));
		FullHouse.add(new Card("C", "4"));
		FullHouse.add(new Card("D", "7"));
		FullHouse.add(new Card("S", "7"));
		assertTrue(Hands.isFullHouse(FullHouse));
		assertFalse(Hands.isFourOfAKind(FullHouse));
	}
	
	//test check for a Flush
	//test check for not a Full House
	public void testHandFlush() {
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "4"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "7"));
		Flush.add(new Card("S", "3"));
		assertTrue(Hands.isFlush(Flush));
		assertFalse(Hands.isFullHouse(Flush));
	}
	
	//test check for a Straight
	//test check for not a Flush
	public void testHandStraight() {
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "4"));
		Straight.add(new Card("H", "5"));
		Straight.add(new Card("C", "6"));
		Straight.add(new Card("D", "7"));
		Straight.add(new Card("S", "8"));
		assertTrue(Hands.isStraight(Straight));
		assertFalse(Hands.isFlush(Straight));
	}
	
	//test check for a Three of a kind
	//test check for not a Straight
	public void testHandThreeOfAKind() {
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "4"));
		ThreeOfAKind.add(new Card("H", "4"));
		ThreeOfAKind.add(new Card("C", "4"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		assertTrue(Hands.isThreeOfAKind(ThreeOfAKind));
		assertFalse(Hands.isStraight(ThreeOfAKind));
	}
	
	//test check for a Two Pair
	//test check for not a Three of a kind
	public void testHandTwoPair() {
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "4"));
		TwoPair.add(new Card("H", "4"));
		TwoPair.add(new Card("C", "9"));
		TwoPair.add(new Card("D", "9"));
		TwoPair.add(new Card("S", "3"));
		assertTrue(Hands.isTwoPair(TwoPair));
		assertFalse(Hands.isThreeOfAKind(TwoPair));
	}
}
