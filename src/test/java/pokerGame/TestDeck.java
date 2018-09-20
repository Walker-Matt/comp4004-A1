package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestDeck extends TestCase {
	public TestDeck(String name) {
		super(name);
	}
	
	//test getter for a Decks list of Cards
	public void testDeckGetDeck() {
		Deck d = new Deck();
		assertTrue(d.getDeck() instanceof List<?>);
	}
	
	//test size of Decks list of Cards
	public void testDeckGetSize() {
		Deck d = new Deck();
		assertTrue(52, d.getSize()); //Should have 52 cards
	}
}
