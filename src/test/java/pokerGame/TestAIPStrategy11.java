package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy11 extends TestCase {
	public TestAIPStrategy11(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_aip_11.txt");
	
	//tests one pair
	public void testOnePair() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(3, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
		assertEquals(3, AIP.removeIndex.get(1).intValue());
		assertEquals(4, AIP.removeIndex.get(2).intValue());
	}
}
