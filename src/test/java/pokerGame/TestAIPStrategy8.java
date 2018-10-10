package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy8 extends TestCase {
	public TestAIPStrategy8(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_aip_8.txt");
	
	//tests three cards the same rank
	public void testThree() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(2, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
		assertEquals(4, AIP.removeIndex.get(1).intValue());
	}
}
