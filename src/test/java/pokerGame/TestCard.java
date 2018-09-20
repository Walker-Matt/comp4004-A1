package pokerGame;

import junit.framework.*;

public class TestCard extends TestCase{
	public TestCard(String name) {
		super(name);
	}
	
	//test getter for a Cards suit
	public void testCardGetSuit() {
		Card c = new Card("S", "A");
		assertTrue(c.getSuit() instanceof String);
		assertEquals("S", c.getSuit());
	}
		
	//test getter for a Cards rank
	public void testCardGetRank() {
		Card c = new Card("S", "A");
		assertTrue(c.getRank() instanceof String);
		assertEquals("A", c.getRank());
	}
}
