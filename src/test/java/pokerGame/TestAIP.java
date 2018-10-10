package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestAIP extends TestCase {
	public TestAIP(String name) {
		super(name);
	}
	
	//test the exchange method in AIP
	/*
	public void testAIPExchangeHighCard() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		AIP.exchange(HighCard);
		assertEquals("3", AIP.discard.get(0).getRank());
		assertEquals("4", AIP.discard.get(1).getRank());
		assertEquals("7", AIP.discard.get(2).getRank());
	}
	*/
	
	//test the oneAway method in AIP
	//test one away from a royal flush
	public void testAIPOneAway() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("C", "3"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		
		assertTrue(AIP.oneAway(royalFlush));
		assertEquals(1, AIP.removeIndex.get(0).intValue());
	}
	
	//test one away from a straight flush
	public void testAIPOneAwayStraightFlush() {
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("C", "3"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		
		assertTrue(AIP.oneAway(straightFlush));
		assertEquals(1, AIP.removeIndex.get(0).intValue());
	}
	
	//tests if has three cards of the same suit
	public void testAIPThreeCardsSameSuit() {
		String[] args = new String[0];
		Game.main(args);
		
		List<Card> threeSameSuit = new ArrayList<Card>();
		threeSameSuit.add(new Card("H", "4"));
		threeSameSuit.add(new Card("D", "6"));
		threeSameSuit.add(new Card("H", "2"));
		threeSameSuit.add(new Card("C", "3"));
		threeSameSuit.add(new Card("H", "9"));
		
		AIP.exchange(threeSameSuit);
		
		assertEquals(1, AIP.removeIndex.get(0).intValue());
		assertEquals(3, AIP.removeIndex.get(1).intValue());
	}
}
