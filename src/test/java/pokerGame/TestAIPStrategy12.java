package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy12 extends TestCase {
	public TestAIPStrategy12(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_aip_12.txt");
	
	//tests two high cards
	public void testTwoHighCard() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(3, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
		assertEquals(1, AIP.removeIndex.get(1).intValue());
		assertEquals(2, AIP.removeIndex.get(2).intValue());
	}
}
