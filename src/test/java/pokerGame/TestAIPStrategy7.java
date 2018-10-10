package pokerGame;

import java.util.List;

import junit.framework.*;

public class TestAIPStrategy7 extends TestCase {
	public TestAIPStrategy7(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_aip_7.txt");

	//tests with two cards the same suit
	public void testTwo() {
		List<Card> hand = hands.get(0).getDeck();
		AIP.exchange(hand);
		assertEquals(3, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
		assertEquals(1, AIP.removeIndex.get(1).intValue());
		assertEquals(2, AIP.removeIndex.get(2).intValue());
	}
	
	//tests with three cards the same suit
	public void testThree() {
		List<Card> hand = hands.get(1).getDeck();
		AIP.exchange(hand);
		assertEquals(1, AIP.removeIndex.size());
		assertEquals(2, AIP.removeIndex.get(0).intValue());
	}
	
	//tests with four cards the same suit
	public void testFour() {
		List<Card> hand = hands.get(2).getDeck();
		AIP.exchange(hand);
		assertEquals(3, AIP.removeIndex.size());
		assertEquals(0, AIP.removeIndex.get(0).intValue());
		assertEquals(1, AIP.removeIndex.get(1).intValue());
		assertEquals(2, AIP.removeIndex.get(2).intValue());
	}
}
