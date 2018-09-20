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
}
