package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestOnePairScore extends TestCase {
	public TestOnePairScore(String name) {
		super(name);
	}
	
	//tests a one pair vs a royal flush
	public void testVsRoyalFlush() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		
		assertTrue(Hands.type(Pair) < Hands.type(royalFlush));
	}
	
	//tests a one pair vs a straight flush
	public void testVsStraightFlush() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("H", "5"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		
		assertTrue(Hands.type(Pair) < Hands.type(straightFlush));
	}
	
	//tests a one pair vs a four of a kind
	public void testVsFourOfAKind() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "4"));
		FourOfAKind.add(new Card("H", "4"));
		FourOfAKind.add(new Card("C", "4"));
		FourOfAKind.add(new Card("D", "4"));
		FourOfAKind.add(new Card("S", "3"));
		
		assertTrue(Hands.type(Pair) < Hands.type(FourOfAKind));
	}
	
	//tests a one pair vs a full house
	public void testVsFullHouse() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "4"));
		FullHouse.add(new Card("H", "4"));
		FullHouse.add(new Card("C", "4"));
		FullHouse.add(new Card("D", "7"));
		FullHouse.add(new Card("S", "7"));
		
		assertTrue(Hands.type(Pair) < Hands.type(FullHouse));
	}
	
	//tests a one pair vs a flush
	public void testVsFlush() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "4"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "7"));
		Flush.add(new Card("S", "3"));
		
		assertTrue(Hands.type(Pair) < Hands.type(Flush));
	}
	
	//tests a one pair vs a straight
	public void testVsStraight() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "4"));
		Straight.add(new Card("H", "5"));
		Straight.add(new Card("C", "6"));
		Straight.add(new Card("D", "7"));
		Straight.add(new Card("S", "8"));
		
		assertTrue(Hands.type(Pair) < Hands.type(Straight));
	}
	
	//tests a one pair vs a three of a kind
	public void testVsThreeOfAKind() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "4"));
		ThreeOfAKind.add(new Card("H", "4"));
		ThreeOfAKind.add(new Card("C", "4"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		
		assertTrue(Hands.type(Pair) < Hands.type(ThreeOfAKind));
	}
	
	//tests a one pair vs a two pair
	public void testVsTwoPair() {
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "4"));
		TwoPair.add(new Card("H", "4"));
		TwoPair.add(new Card("C", "9"));
		TwoPair.add(new Card("D", "9"));
		TwoPair.add(new Card("S", "3"));
		
		assertTrue(Hands.type(Pair) < Hands.type(TwoPair));
	}
	
	//tests a one pair vs a high card
	public void testVsHighCard() {
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
		
		assertTrue(Hands.type(Pair) > Hands.type(HighCard));
	}
}
