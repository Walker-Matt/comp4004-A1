package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestRoyalFlushScore extends TestCase {
	public TestRoyalFlushScore(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_score.txt");
	List<Card> royalFlush = hands.get(0).getDeck();
	List<Card> straightFlush = hands.get(1).getDeck();
	List<Card> FourOfAKind = hands.get(2).getDeck();
	List<Card> FullHouse = hands.get(3).getDeck();
	List<Card> Flush = hands.get(4).getDeck();
	List<Card> Straight = hands.get(5).getDeck();
	List<Card> ThreeOfAKind = hands.get(6).getDeck();
	List<Card> TwoPair = hands.get(7).getDeck();
	List<Card> Pair = hands.get(8).getDeck();
	List<Card> HighCard = hands.get(9).getDeck();

	//tests a royal flush vs a straight flush
	public void testVsStraightFlush() {
		assertTrue(Hands.type(royalFlush) > Hands.type(straightFlush));
	}
	
	//tests a royal flush vs a four of a kind
	public void testVsFourOfAKind() {
		assertTrue(Hands.type(royalFlush) > Hands.type(FourOfAKind));
	}
	
	//tests a royal flush vs a full house
	public void testVsFullHouse() {
		assertTrue(Hands.type(royalFlush) > Hands.type(FullHouse));
	}
	
	//tests a royal flush vs a flush
	public void testVsFlush() {
		assertTrue(Hands.type(royalFlush) > Hands.type(Flush));
	}
	
	//tests a royal flush vs a straight
	public void testVsStraight() {
		assertTrue(Hands.type(royalFlush) > Hands.type(Straight));
	}
	
	//tests a royal flush vs a three of a kind
	public void testVsThreeOfAKind() {
		assertTrue(Hands.type(royalFlush) > Hands.type(ThreeOfAKind));
	}
	
	//tests a royal flush vs a two pair
	public void testVsTwoPair() {
		assertTrue(Hands.type(royalFlush) > Hands.type(TwoPair));
	}
	
	//tests a royal flush vs a one pair
	public void testVsOnePair() {
		assertTrue(Hands.type(royalFlush) > Hands.type(Pair));
	}
	
	//tests a royal flush vs a high card
	public void testVsHighCard() {
		assertTrue(Hands.type(royalFlush) > Hands.type(HighCard));
	}
}
