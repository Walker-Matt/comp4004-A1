package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestHands extends TestCase {
	public TestHands(String name) {
		super(name);
	}
	
	//test check for a Royal Flush
	public void testHandRoyalFlush() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		assertTrue(Hands.isRoyalFlush(royalFlush));
	}
}
