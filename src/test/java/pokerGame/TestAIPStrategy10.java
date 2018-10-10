package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy10 extends TestCase {
	public TestAIPStrategy10(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_aip_10.txt");
	
	//tests two pairs
	public void testTwoPairs() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(1, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
	}
}
