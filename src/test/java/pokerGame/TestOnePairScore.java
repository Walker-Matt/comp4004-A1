package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestOnePairScore extends TestCase {
	public TestOnePairScore(String name) {
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
	
	//tests a one pair vs a royal flush
	public void testVsRoyalFlush() {
		assertTrue(Hands.type(Pair) < Hands.type(royalFlush));
	}
	
	//tests a one pair vs a straight flush
	public void testVsStraightFlush() {
		assertTrue(Hands.type(Pair) < Hands.type(straightFlush));
	}
	
	//tests a one pair vs a four of a kind
	public void testVsFourOfAKind() {
		assertTrue(Hands.type(Pair) < Hands.type(FourOfAKind));
	}
	
	//tests a one pair vs a full house
	public void testVsFullHouse() {
		assertTrue(Hands.type(Pair) < Hands.type(FullHouse));
	}
	
	//tests a one pair vs a flush
	public void testVsFlush() {
		assertTrue(Hands.type(Pair) < Hands.type(Flush));
	}
	
	//tests a one pair vs a straight
	public void testVsStraight() {
		assertTrue(Hands.type(Pair) < Hands.type(Straight));
	}
	
	//tests a one pair vs a three of a kind
	public void testVsThreeOfAKind() {
		assertTrue(Hands.type(Pair) < Hands.type(ThreeOfAKind));
	}
	
	//tests a one pair vs a two pair
	public void testVsTwoPair() {
		assertTrue(Hands.type(Pair) < Hands.type(TwoPair));
	}
	
	//tests a one pair vs a high card
	public void testVsHighCard() {
		assertTrue(Hands.type(Pair) > Hands.type(HighCard));
	}
}
