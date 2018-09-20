package pokerGame;

import junit.framework.*;

public class TestCard extends TestCase{
	public TestCard(String name) {
		super(name);
	}
	
	//test getter for a Cards rank
	public void testCardGetRank() {
		Card c = new Card();
		assertTrue(c.getRank() instanceof String);
	}
	
	//test getter for a Cards suit
	public void testCardGetSuit() {
		Card c = new Card();
		assertTrue(c.getSuit() instanceof String);
	}
}
