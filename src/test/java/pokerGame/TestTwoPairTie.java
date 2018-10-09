package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTwoPairTie extends TestCase {
	public TestTwoPairTie(String name) {
		super(name);
	}

	List<Deck> hands = ReadFile.read("tests/test_two_pair_tie.txt");
	
	//tests two two pair hands with different pairs
	public void testDifferentPairs() {
		List<Card> TwoPair1 = hands.get(0).getDeck();
		
		List<Card> TwoPair2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(3, TwoPair1, TwoPair2));
	}
	
	//tests two two pair hands with same pairs
	public void testSamePairs() {
		List<Card> TwoPair1 = hands.get(2).getDeck();
		
		List<Card> TwoPair2 = hands.get(3).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(3, TwoPair1, TwoPair2));
	}
}
