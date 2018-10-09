package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestHighCardTie extends TestCase {
	public TestHighCardTie(String name) {
		super(name);
	}

	//tests two high card hands with same high card
	public void testTie() {
		List<Card> HighCard1 = new ArrayList<Card>();
		HighCard1.add(new Card("S", "4"));
		HighCard1.add(new Card("H", "J"));
		HighCard1.add(new Card("C", "9"));
		HighCard1.add(new Card("D", "7"));
		HighCard1.add(new Card("S", "3"));
		
		List<Card> HighCard2 = new ArrayList<Card>();
		HighCard2.add(new Card("S", "4"));
		HighCard2.add(new Card("S", "J"));
		HighCard2.add(new Card("C", "9"));
		HighCard2.add(new Card("D", "7"));
		HighCard2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settleHighCardSuit(HighCard1, HighCard2));
	}
}
