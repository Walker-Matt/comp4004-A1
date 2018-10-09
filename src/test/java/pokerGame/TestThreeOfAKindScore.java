package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestThreeOfAKindScore extends TestCase {
	public TestThreeOfAKindScore(String name) {
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
	
	//tests a three of a kind vs a royal flush
	public void testVsRoyalFlush() {
		assertTrue(Hands.type(ThreeOfAKind) < Hands.type(royalFlush));
	}
	
	//tests a three of a kind vs a straight flush
	public void testVsStraightFlush() {
		assertTrue(Hands.type(ThreeOfAKind) < Hands.type(straightFlush));
	}
	
	//tests a three of a kind vs a four of a kind
	public void testVsFourOfAKind() {
		assertTrue(Hands.type(ThreeOfAKind) < Hands.type(FourOfAKind));
	}
	
	//tests a three of a kind vs a full house
	public void testVsFullHouse() {
		assertTrue(Hands.type(ThreeOfAKind) < Hands.type(FullHouse));
	}
	
	//tests a three of a kind vs a flush
	public void testVsFlush() {
		assertTrue(Hands.type(ThreeOfAKind) < Hands.type(Flush));
	}
	
	//tests a three of a kind vs a straight
	public void testVsStraight() {
		assertTrue(Hands.type(ThreeOfAKind) < Hands.type(Straight));
	}
	
	//tests a three of a kind vs a two pair
	public void testVsTwoPair() {
		assertTrue(Hands.type(ThreeOfAKind) > Hands.type(TwoPair));
	}
	
	//tests a three of a kind vs a one pair
	public void testVsOnePair() {
		assertTrue(Hands.type(ThreeOfAKind) > Hands.type(Pair));
	}
	
	//tests a three of a kind vs a high card 
	public void testVsHighCard() {
		assertTrue(Hands.type(ThreeOfAKind) > Hands.type(HighCard));
	}
}
