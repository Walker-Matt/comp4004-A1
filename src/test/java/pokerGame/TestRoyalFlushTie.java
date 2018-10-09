package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestRoyalFlushTie extends TestCase {
	public TestRoyalFlushTie(String name) {
		super(name);
	}

	//tests two royal flush hands
	public void testTie() {
		List<Card> royalFlush1 = new ArrayList<Card>();
		royalFlush1.add(new Card("H", "10"));
		royalFlush1.add(new Card("H", "J"));
		royalFlush1.add(new Card("H", "Q"));
		royalFlush1.add(new Card("H", "K"));
		royalFlush1.add(new Card("H", "A"));
		
		List<Card> royalFlush2 = new ArrayList<Card>();
		royalFlush2.add(new Card("S", "10"));
		royalFlush2.add(new Card("S", "J"));
		royalFlush2.add(new Card("S", "Q"));
		royalFlush2.add(new Card("S", "K"));
		royalFlush2.add(new Card("S", "A"));
		
		assertEquals("AIP wins.", Tie.settle(10, royalFlush1, royalFlush2));
	}
}
