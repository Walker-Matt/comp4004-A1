package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightFlushTie extends TestCase {
	public TestStraightFlushTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_straight_flush_tie.txt");

	//tests two straight flush hands with different high cards
	public void testDifferentHighCards() {
		List<Card> straightFlush1 = hands.get(0).getDeck();
		
		List<Card> straightFlush2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(9, straightFlush1, straightFlush2));
	}
	
	//tests two straight flush hands with same high cards
	public void testSameHighCards() {
		List<Card> straightFlush1 = hands.get(2).getDeck();
		
		List<Card> straightFlush2 = hands.get(3).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(9, straightFlush1, straightFlush2));
	}
}
