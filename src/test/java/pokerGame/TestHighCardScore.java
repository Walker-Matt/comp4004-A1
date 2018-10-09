package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestHighCardScore extends TestCase {
	public TestHighCardScore(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_high_card_score.txt");

	//tests a high card vs a royal flush
	public void testVsRoyalFlush() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> royalFlush = hands.get(1).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(royalFlush));
	}
	
	//tests a high card vs a straight flush
	public void testVsStraightFlush() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> straightFlush = hands.get(2).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(straightFlush));
	}
	
	//tests a high card vs a four of a kind
	public void testVsFourOfAKind() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> FourOfAKind = hands.get(3).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(FourOfAKind));
	}
	
	//tests a high card vs a full house
	public void testVsFullHouse() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> FullHouse = hands.get(4).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(FullHouse));
	}
	
	//tests a high card vs a flush
	public void testVsFlush() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> Flush = hands.get(5).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(Flush));
	}
	
	//tests a high card vs a straight
	public void testVsStraight() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> Straight = hands.get(6).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(Straight));
	}
	
	//tests a high card vs a three of a kind
	public void testVsThreeOfAKind() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> ThreeOfAKind = hands.get(7).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(ThreeOfAKind));
	}
	
	//tests a high card vs a two pair
	public void testVsTwoPair() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> TwoPair = hands.get(8).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(TwoPair));
	}
	
	//tests a high card vs a one pair
	public void testVsOnePair() {
		List<Card> HighCard = hands.get(0).getDeck();
		
		List<Card> Pair = hands.get(9).getDeck();
		
		assertTrue(Hands.type(HighCard) < Hands.type(Pair));
	}
}
