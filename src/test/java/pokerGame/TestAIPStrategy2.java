package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy2 extends TestCase {
	public TestAIPStrategy2(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_aip_2.txt");
	
	//tests with one card of wrong suit
	public void testWrongSuit() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(1, AIP.removeIndex.size());
		assertEquals(2, AIP.removeIndex.get(0).intValue());
	}
	
	//tests with one card of wrong rank
	public void testWrongRank() {
		List<Card> hand = hands.get(1).getDeck();
		AIP.exchange(hand);
		assertEquals(1, AIP.removeIndex.size());
		assertEquals(2, AIP.removeIndex.get(0).intValue());
	}
	
	//tests with one card of wrong suit and rank
	public void testWrongSuitRank() {
		List<Card> hand = hands.get(2).getDeck();
		AIP.exchange(hand);
		assertEquals(1, AIP.removeIndex.size());
		assertEquals(2, AIP.removeIndex.get(0).intValue());
	}
}
