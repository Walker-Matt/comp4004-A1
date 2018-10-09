package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestOnePairTie extends TestCase {
	public TestOnePairTie(String name) {
		super(name);
	}

	//tests two one pair hands with different pairs
	public void testDifferentPair() {
		List<Card> Pair1 = new ArrayList<Card>();
		Pair1.add(new Card("S", "4"));
		Pair1.add(new Card("H", "4"));
		Pair1.add(new Card("C", "9"));
		Pair1.add(new Card("D", "7"));
		Pair1.add(new Card("S", "3"));
		
		List<Card> Pair2 = new ArrayList<Card>();
		Pair2.add(new Card("S", "5"));
		Pair2.add(new Card("H", "5"));
		Pair2.add(new Card("C", "9"));
		Pair2.add(new Card("D", "7"));
		Pair2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settlePair(Pair1, Pair2));
	}
	
	//tests two one pair hands with same pairs
	public void testSamePair() {
		List<Card> Pair1 = new ArrayList<Card>();
		Pair1.add(new Card("D", "4"));
		Pair1.add(new Card("C", "4"));
		Pair1.add(new Card("C", "9"));
		Pair1.add(new Card("D", "7"));
		Pair1.add(new Card("S", "3"));
		
		List<Card> Pair2 = new ArrayList<Card>();
		Pair2.add(new Card("S", "4"));
		Pair2.add(new Card("H", "4"));
		Pair2.add(new Card("C", "9"));
		Pair2.add(new Card("D", "7"));
		Pair2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settlePair(Pair1, Pair2));
	}
}
