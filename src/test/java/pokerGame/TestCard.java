package pokerGame;

import junit.framework.*;

public class TestCard extends TestCase{
	public TestCard(String name) {
		super(name);
	}
	
	//test getter for a Cards rank
	public void testCardGetRank() {
		Card c = new Card();
		assertEquals("A", c.getRank());
	}
	
	//test getter for a Cards suit
	public void testCardGetSuit() {
		Card c = new Card();
		assertEquals("S", c.getSuit());
	}
}
