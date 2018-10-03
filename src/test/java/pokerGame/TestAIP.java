package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestAIP extends TestCase {
	public TestAIP(String name) {
		super(name);
	}
	
	//test the exchange method in AIP
	public void testAIPExchangeHighCard() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		AIP.exchange(HighCard);
		assertEquals(AIP.discard.get(0).getRank() == "3");
		assertEquals(AIP.discard.get(1).getRank() == "4");
		assertEquals(AIP.discard.get(2).getRank() == "7");
	}
	
	//test the oneAway method in AIP
	public void testAIPOneAway() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("C", "3"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		
		assertTrue(AIP.oneAway(royalFlush));
		assertEquals(AIP.removeIndex(0) == 1);
	}
}
