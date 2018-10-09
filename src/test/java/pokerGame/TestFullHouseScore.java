package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFullHouseScore extends TestCase {
	public TestFullHouseScore(String name) {
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

	//tests a full house vs a royal flush
	public void testVsRoyalFlush() {
		assertTrue(Hands.type(FullHouse) < Hands.type(royalFlush));
	}
	
	//tests a full house vs a straight flush
	public void testVsStraightFlush() {
		assertTrue(Hands.type(FullHouse) < Hands.type(straightFlush));
	}
	
	//tests a full house vs a four of a kind
	public void testVsFourOfAKind() {
		assertTrue(Hands.type(FullHouse) < Hands.type(FourOfAKind));
	}
	
	//tests a full house vs a flush
	public void testVsFlush() {
		assertTrue(Hands.type(FullHouse) > Hands.type(Flush));
	}
	
	//tests a full house vs a straight
	public void testVsStraight() {
		assertTrue(Hands.type(FullHouse) > Hands.type(Straight));
	}
	
	//tests a full house vs a three of a kind
	public void testVsThreeOfAKind() {
		assertTrue(Hands.type(FullHouse) > Hands.type(ThreeOfAKind));
	}
	
	//tests a full house vs a two pair
	public void testVsTwoPair() {
		assertTrue(Hands.type(FullHouse) > Hands.type(TwoPair));
	}
	
	//tests a full house vs a one pair
	public void testVsOnePair() {
		assertTrue(Hands.type(FullHouse) > Hands.type(Pair));
	}
	
	//tests a full house vs a high card
	public void testVsHighCard() {
		assertTrue(Hands.type(FullHouse) > Hands.type(HighCard));
	}
}
