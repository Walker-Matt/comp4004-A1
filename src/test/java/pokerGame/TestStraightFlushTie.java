package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightFlushTie extends TestCase {
	public TestStraightFlushTie(String name) {
		super(name);
	}

	//tests two straight flush hands with different high cards
	public void testDifferentHighCards() {
		List<Card> straightFlush1 = new ArrayList<Card>();
		straightFlush1.add(new Card("H", "4"));
		straightFlush1.add(new Card("H", "5"));
		straightFlush1.add(new Card("H", "6"));
		straightFlush1.add(new Card("H", "7"));
		straightFlush1.add(new Card("H", "8"));
		
		List<Card> straightFlush2 = new ArrayList<Card>();
		straightFlush2.add(new Card("H", "5"));
		straightFlush2.add(new Card("H", "6"));
		straightFlush2.add(new Card("H", "7"));
		straightFlush2.add(new Card("H", "8"));
		straightFlush2.add(new Card("H", "9"));
		
		assertEquals("AIP wins.", Tie.settle(9, straightFlush1, straightFlush2));
	}
	
	//tests two straight flush hands with same high cards
	public void testSameHighCards() {
		List<Card> straightFlush1 = new ArrayList<Card>();
		straightFlush1.add(new Card("H", "4"));
		straightFlush1.add(new Card("H", "5"));
		straightFlush1.add(new Card("H", "6"));
		straightFlush1.add(new Card("H", "7"));
		straightFlush1.add(new Card("H", "8"));
		
		List<Card> straightFlush2 = new ArrayList<Card>();
		straightFlush2.add(new Card("S", "4"));
		straightFlush2.add(new Card("S", "5"));
		straightFlush2.add(new Card("S", "6"));
		straightFlush2.add(new Card("S", "7"));
		straightFlush2.add(new Card("S", "8"));
		
		assertEquals("AIP wins.", Tie.settle(9, straightFlush1, straightFlush2));
	}
}
