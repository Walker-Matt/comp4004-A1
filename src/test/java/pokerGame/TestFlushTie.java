package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFlushTie extends TestCase {
	public TestFlushTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_flush_tie.txt");

	//tests two flush hands with different high cards
	public void testDifferentHighCards() {
		List<Card> Flush1 = hands.get(0).getDeck();
		
		List<Card> Flush2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with one same high card
	public void testOneSameHighCard() {
		List<Card> Flush1 = hands.get(2).getDeck();
		
		List<Card> Flush2 = hands.get(3).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with two same high card
	public void testTwoSameHighCards() {
		List<Card> Flush1 = hands.get(4).getDeck();
		
		List<Card> Flush2 = hands.get(5).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with three same high card
	public void testThreeSameHighCards() {
		List<Card> Flush1 = hands.get(6).getDeck();
		
		List<Card> Flush2 = hands.get(7).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with four same high card
	public void testFourSameHighCards() {
		List<Card> Flush1 = hands.get(8).getDeck();
		
		List<Card> Flush2 = hands.get(9).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with all same card ranks
	public void testAllSameRanks() {
		List<Card> Flush1 = hands.get(10).getDeck();
		
		List<Card> Flush2 = hands.get(11).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
}
