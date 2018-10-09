package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFourOfAKindScore extends TestCase{
	public TestFourOfAKindScore(String name) {
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

	//tests a four of a kind vs a royal flush
	public void testVsRoyalFlush() {
		assertTrue(Hands.type(FourOfAKind) < Hands.type(royalFlush));
	}
	
	//tests a four of a kind vs a straight flush
	public void testVsStraightFlush() {
		assertTrue(Hands.type(FourOfAKind) < Hands.type(straightFlush));
	}
	
	//tests a four of a kind vs a full house
	public void testVsFullHouse() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(FullHouse));
	}
	
	//tests a four of a kind vs a flush
	public void testVsFlush() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(Flush));
	}
	
	//tests a four of a kind vs a straight
	public void testVsStraight() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(Straight));
	}
	
	//tests a four of a kind vs a three of a kind
	public void testVsThreeOfAKind() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(ThreeOfAKind));
	}
	
	//tests a four of a kind vs a two pair
	public void testVsTwoPair() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(TwoPair));
	}
	
	//tests a four of a kind vs a one pair
	public void testVsOnePair() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(Pair));
	}
	
	//tests a four of a kind vs a high card
	public void testVsHighCard() {
		assertTrue(Hands.type(FourOfAKind) > Hands.type(HighCard));
	}
}
