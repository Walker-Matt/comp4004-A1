package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightTie extends TestCase {
	public TestStraightTie(String name) {
		super(name);
	}
	
	//tests two straight hands with different high cards
	public void testDifferentHighCards() {
		List<Card> Straight1 = new ArrayList<Card>();
		Straight1.add(new Card("S", "4"));
		Straight1.add(new Card("H", "5"));
		Straight1.add(new Card("C", "6"));
		Straight1.add(new Card("D", "7"));
		Straight1.add(new Card("S", "8"));
		
		List<Card> Straight2 = new ArrayList<Card>();
		Straight2.add(new Card("S", "5"));
		Straight2.add(new Card("H", "6"));
		Straight2.add(new Card("C", "7"));
		Straight2.add(new Card("D", "8"));
		Straight2.add(new Card("S", "9"));
		
		assertEquals("AIP wins.", Tie.settle(5, Straight1, Straight2));
	}
	
	
	//tests two straight hands with same high cards
	public void testSameHighCards() {
		List<Card> Straight1 = new ArrayList<Card>();
		Straight1.add(new Card("H", "4"));
		Straight1.add(new Card("C", "5"));
		Straight1.add(new Card("D", "6"));
		Straight1.add(new Card("S", "7"));
		Straight1.add(new Card("H", "8"));
		
		List<Card> Straight2 = new ArrayList<Card>();
		Straight2.add(new Card("S", "4"));
		Straight2.add(new Card("H", "5"));
		Straight2.add(new Card("C", "6"));
		Straight2.add(new Card("D", "7"));
		Straight2.add(new Card("S", "8"));
		
		assertEquals("AIP wins.", Tie.settle(5, Straight1, Straight2));
	}
}
