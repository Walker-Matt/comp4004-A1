package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestRoyalFlushTie extends TestCase {
	public TestRoyalFlushTie(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_royal_flush_tie.txt");
	
	//tests two royal flush hands
	public void testTie() {
		List<Card> royalFlush1 = hands.get(0).getDeck();
		
		List<Card> royalFlush2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(10, royalFlush1, royalFlush2));
	}
}
