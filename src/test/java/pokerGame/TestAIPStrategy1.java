package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy1 extends TestCase {
	public TestAIPStrategy1(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_aip_1.txt");

	//Tests with Royal Flush
	public void testAIPRoyalFlush() {
		List<Card> hand = hands.get(0).getDeck();
		assertEquals(hand, AIP.exchange(hand));
	}
	
	//Tests with Straight Flush
	public void testAIPStraightFlush() {
		List<Card> hand = hands.get(1).getDeck();
		assertEquals(hand, AIP.exchange(hand));
	}
	
	//Tests with Four of a kind
	public void testAIPFourOfAKind() {
		List<Card> hand = hands.get(2).getDeck();
		assertEquals(hand, AIP.exchange(hand));
	}
	
	//tests with full house
	public void testAIPFullHouse() {
		List<Card> hand = hands.get(3).getDeck();
		assertEquals(hand, AIP.exchange(hand));
	}
	
	//tests with flush
	public void testAIPFlush() {
		List<Card> hand = hands.get(4).getDeck();
		assertEquals(hand, AIP.exchange(hand));
	}
	
	//tests with straight
	public void testAIPStraight() {
		List<Card> hand = hands.get(5).getDeck();
		assertEquals(hand, AIP.exchange(hand));
	}
}
