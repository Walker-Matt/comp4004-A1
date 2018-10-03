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
}
