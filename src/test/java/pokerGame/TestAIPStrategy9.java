package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy9 extends TestCase {
	public TestAIPStrategy9(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_aip_9.txt");
	
	//tests three cards in a sequence
	public void testThree() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(2, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
		assertEquals(4, AIP.removeIndex.get(1).intValue());
	}
}
