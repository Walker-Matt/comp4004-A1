package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTwoPairTie extends TestCase {
	public TestTwoPairTie(String name) {
		super(name);
	}

	//tests two two pair hands with different pairs
	public void testDifferentPairs() {
		List<Card> TwoPair1 = new ArrayList<Card>();
		TwoPair1.add(new Card("S", "2"));
		TwoPair1.add(new Card("H", "2"));
		TwoPair1.add(new Card("C", "5"));
		TwoPair1.add(new Card("D", "5"));
		TwoPair1.add(new Card("S", "3"));
		
		List<Card> TwoPair2 = new ArrayList<Card>();
		TwoPair2.add(new Card("S", "4"));
		TwoPair2.add(new Card("H", "4"));
		TwoPair2.add(new Card("C", "9"));
		TwoPair2.add(new Card("D", "9"));
		TwoPair2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(3, TwoPair1, TwoPair2));
	}
	
	//tests two two pair hands with same pairs
	public void testSamePairs() {
		List<Card> TwoPair1 = new ArrayList<Card>();
		TwoPair1.add(new Card("S", "4"));
		TwoPair1.add(new Card("H", "4"));
		TwoPair1.add(new Card("C", "9"));
		TwoPair1.add(new Card("D", "9"));
		TwoPair1.add(new Card("S", "3"));
		
		List<Card> TwoPair2 = new ArrayList<Card>();
		TwoPair2.add(new Card("C", "4"));
		TwoPair2.add(new Card("D", "4"));
		TwoPair2.add(new Card("H", "9"));
		TwoPair2.add(new Card("S", "9"));
		TwoPair2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(3, TwoPair1, TwoPair2));
	}
}
