package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFlushTie extends TestCase {
	public TestFlushTie(String name) {
		super(name);
	}

	//tests two flush hands with different high cards
	public void testDifferentHighCards() {
		List<Card> Flush1 = new ArrayList<Card>();
		Flush1.add(new Card("S", "4"));
		Flush1.add(new Card("S", "2"));
		Flush1.add(new Card("S", "9"));
		Flush1.add(new Card("S", "7"));
		Flush1.add(new Card("S", "3"));
		
		List<Card> Flush2 = new ArrayList<Card>();
		Flush2.add(new Card("S", "4"));
		Flush2.add(new Card("S", "J"));
		Flush2.add(new Card("S", "9"));
		Flush2.add(new Card("S", "7"));
		Flush2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with one same high card
	public void testOneSameHighCard() {
		List<Card> Flush1 = new ArrayList<Card>();
		Flush1.add(new Card("S", "4"));
		Flush1.add(new Card("S", "J"));
		Flush1.add(new Card("S", "8"));
		Flush1.add(new Card("S", "7"));
		Flush1.add(new Card("S", "3"));
		
		List<Card> Flush2 = new ArrayList<Card>();
		Flush2.add(new Card("S", "4"));
		Flush2.add(new Card("S", "J"));
		Flush2.add(new Card("S", "9"));
		Flush2.add(new Card("S", "7"));
		Flush2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with two same high card
	public void testTwoSameHighCard() {
		List<Card> Flush1 = new ArrayList<Card>();
		Flush1.add(new Card("S", "4"));
		Flush1.add(new Card("S", "J"));
		Flush1.add(new Card("S", "9"));
		Flush1.add(new Card("S", "6"));
		Flush1.add(new Card("S", "3"));
		
		List<Card> Flush2 = new ArrayList<Card>();
		Flush2.add(new Card("S", "4"));
		Flush2.add(new Card("S", "J"));
		Flush2.add(new Card("S", "9"));
		Flush2.add(new Card("S", "7"));
		Flush2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with three same high card
	public void testThreeSameHighCard() {
		List<Card> Flush1 = new ArrayList<Card>();
		Flush1.add(new Card("S", "3"));
		Flush1.add(new Card("S", "J"));
		Flush1.add(new Card("S", "9"));
		Flush1.add(new Card("S", "7"));
		Flush1.add(new Card("S", "2"));
		
		List<Card> Flush2 = new ArrayList<Card>();
		Flush2.add(new Card("S", "4"));
		Flush2.add(new Card("S", "J"));
		Flush2.add(new Card("S", "9"));
		Flush2.add(new Card("S", "7"));
		Flush2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with four same high card
	public void testFourSameHighCard() {
		List<Card> Flush1 = new ArrayList<Card>();
		Flush1.add(new Card("S", "4"));
		Flush1.add(new Card("S", "2"));
		Flush1.add(new Card("S", "9"));
		Flush1.add(new Card("S", "7"));
		Flush1.add(new Card("S", "2"));
		
		List<Card> Flush2 = new ArrayList<Card>();
		Flush2.add(new Card("S", "4"));
		Flush2.add(new Card("S", "J"));
		Flush2.add(new Card("S", "9"));
		Flush2.add(new Card("S", "7"));
		Flush2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
	
	//tests two flush hands with all same card ranks
	public void testAllSameRanks() {
		List<Card> Flush1 = new ArrayList<Card>();
		Flush1.add(new Card("D", "4"));
		Flush1.add(new Card("D", "2"));
		Flush1.add(new Card("D", "9"));
		Flush1.add(new Card("D", "7"));
		Flush1.add(new Card("D", "3"));
		
		List<Card> Flush2 = new ArrayList<Card>();
		Flush2.add(new Card("S", "4"));
		Flush2.add(new Card("S", "J"));
		Flush2.add(new Card("S", "9"));
		Flush2.add(new Card("S", "7"));
		Flush2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(6, Flush1, Flush2));
	}
}
