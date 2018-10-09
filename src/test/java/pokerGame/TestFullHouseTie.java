package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFullHouseTie extends TestCase {
	public TestFullHouseTie(String name) {
		super(name);
	}

	//tests two full house hands
	public void testTie() {
		List<Card> FullHouse1 = new ArrayList<Card>();
		FullHouse1.add(new Card("S", "4"));
		FullHouse1.add(new Card("H", "4"));
		FullHouse1.add(new Card("C", "4"));
		FullHouse1.add(new Card("D", "7"));
		FullHouse1.add(new Card("S", "7"));
		
		List<Card> FullHouse2 = new ArrayList<Card>();
		FullHouse2.add(new Card("S", "5"));
		FullHouse2.add(new Card("H", "5"));
		FullHouse2.add(new Card("C", "5"));
		FullHouse2.add(new Card("D", "6"));
		FullHouse2.add(new Card("S", "6"));
		
		assertEquals("AIP wins.", Tie.settle(7, FullHouse1, FullHouse2));
	}
}
