package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightFlushScore extends TestCase {
	public TestStraightFlushScore(String name) {
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

	//tests a straight flush vs a royal flush
	public void testVsRoyalFlush() {
		assertTrue(Hands.type(straightFlush) < Hands.type(royalFlush));
	}
	
	//tests a straight flush vs a four of a kind
	public void testVsFourOfAKind() {
		assertTrue(Hands.type(straightFlush) > Hands.type(FourOfAKind));
	}
	
	//tests a straight flush vs a full house
	public void testVsFullHouse() {
		assertTrue(Hands.type(straightFlush) > Hands.type(FullHouse));
	}
	
	//tests a straight flush vs a flush
	public void testVsFlush() {
		assertTrue(Hands.type(straightFlush) > Hands.type(Flush));
	}
	
	//tests a straight flush vs a straight
	public void testVsStraight() {
		assertTrue(Hands.type(straightFlush) > Hands.type(Straight));
	}
	
	//tests a straight flush vs a three of a kind
	public void testVsThreeOfAKind() {
		assertTrue(Hands.type(straightFlush) > Hands.type(ThreeOfAKind));
	}
	
	//tests a straight flush vs a two pair
	public void testVsTwoPair() {
		assertTrue(Hands.type(straightFlush) > Hands.type(TwoPair));
	}
	
	//tests a straight flush vs a one pair
	public void testVsOnePair() {
		assertTrue(Hands.type(straightFlush) > Hands.type(Pair));
	}
	
	//tests a straight flush vs a high card
	public void testVsHighCard() {
		assertTrue(Hands.type(straightFlush) > Hands.type(HighCard));
	}
}
