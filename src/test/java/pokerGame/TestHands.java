package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestHands extends TestCase {
	public TestHands(String name) {
		super(name);
	}
	
	//test type method in Hands
	public void testHandsType() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("H", "5"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "4"));
		FourOfAKind.add(new Card("H", "4"));
		FourOfAKind.add(new Card("C", "4"));
		FourOfAKind.add(new Card("D", "4"));
		FourOfAKind.add(new Card("S", "3"));
		
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "4"));
		FullHouse.add(new Card("H", "4"));
		FullHouse.add(new Card("C", "4"));
		FullHouse.add(new Card("D", "7"));
		FullHouse.add(new Card("S", "7"));
		
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "4"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "7"));
		Flush.add(new Card("S", "3"));
		
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "4"));
		Straight.add(new Card("H", "5"));
		Straight.add(new Card("C", "6"));
		Straight.add(new Card("D", "7"));
		Straight.add(new Card("S", "8"));
		
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "4"));
		ThreeOfAKind.add(new Card("H", "4"));
		ThreeOfAKind.add(new Card("C", "4"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "4"));
		TwoPair.add(new Card("H", "4"));
		TwoPair.add(new Card("C", "9"));
		TwoPair.add(new Card("D", "9"));
		TwoPair.add(new Card("S", "3"));
		
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		assertEquals("Royal Flush", Hands.type(royalFlush));
		assertEquals("Straight Flush", Hands.type(straightFlush));
		assertEquals("Four of a Kind", Hands.type(FourOfAKind));
		assertEquals("Full House", Hands.type(FullHouse));
		assertEquals("Flush", Hands.type(Flush));
		assertEquals("Straight", Hands.type(Straight));
		assertEquals("Three of a Kind", Hands.type(ThreeOfAKind));
		assertEquals("Two Pair", Hands.type(TwoPair));
		assertEquals("Pair", Hands.type(Pair));
		assertEquals("High Card", Hands.type(HighCard));
	}
	
	//test check for a Royal Flush
	//test check for not everything else
	public void testHandsRoyalFlush() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		assertTrue(Hands.isRoyalFlush(royalFlush));
		assertFalse(Hands.isFourOfAKind(royalFlush));
		assertFalse(Hands.isFullHouse(royalFlush));
		assertFalse(Hands.isThreeOfAKind(royalFlush));
		assertFalse(Hands.isTwoPair(royalFlush));
		assertFalse(Hands.isPair(royalFlush));
	}
	
	//test check for a Straight Flush
	//test check for not everything else
	public void testHandsStraightFlush() {
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("H", "5"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		assertTrue(Hands.isStraightFlush(straightFlush));
		assertFalse(Hands.isRoyalFlush(straightFlush));
		assertFalse(Hands.isFourOfAKind(straightFlush));
		assertFalse(Hands.isFullHouse(straightFlush));
		assertFalse(Hands.isThreeOfAKind(straightFlush));
		assertFalse(Hands.isTwoPair(straightFlush));
		assertFalse(Hands.isPair(straightFlush));
	}
	
	//test check for a Four of a Kind
	//test check for not everything else
	public void testHandsFourOfAKind() {
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
	
	//test check for a Full House
	//test check for not everything else
	public void testHandsFullHouse() {
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "4"));
		FullHouse.add(new Card("H", "4"));
		FullHouse.add(new Card("C", "4"));
		FullHouse.add(new Card("D", "7"));
		FullHouse.add(new Card("S", "7"));
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
	
	//test check for a Flush
	//test check for not everything else
	public void testHandsFlush() {
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "4"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "7"));
		Flush.add(new Card("S", "3"));
		assertTrue(Hands.isFlush(Flush));
		assertFalse(Hands.isRoyalFlush(Flush));
		assertFalse(Hands.isStraightFlush(Flush));
		assertFalse(Hands.isFourOfAKind(Flush));
		assertFalse(Hands.isFullHouse(Flush));
		assertFalse(Hands.isStraight(Flush));
		assertFalse(Hands.isThreeOfAKind(Flush));
		assertFalse(Hands.isTwoPair(Flush));
		assertFalse(Hands.isPair(Flush));
	}
	
	//test check for a Straight
	//test check for not everything else
	public void testHandsStraight() {
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "4"));
		Straight.add(new Card("H", "5"));
		Straight.add(new Card("C", "6"));
		Straight.add(new Card("D", "7"));
		Straight.add(new Card("S", "8"));
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
	
	//test check for a Three of a kind
	//test check for not everything else
	public void testHandsThreeOfAKind() {
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
	
	//test check for a Two Pair
	//test check for not everything else
	public void testHandsTwoPair() {
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "4"));
		TwoPair.add(new Card("H", "4"));
		TwoPair.add(new Card("C", "9"));
		TwoPair.add(new Card("D", "9"));
		TwoPair.add(new Card("S", "3"));
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
	
	//test check for a Pair
	//test check for not a Two Pair
	public void testHandsPair() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
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
	
	//test check for a High Card
	//test check for not a Pair
	public void testHandsHighCard() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
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
