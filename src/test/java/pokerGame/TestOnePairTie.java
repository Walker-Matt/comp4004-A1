package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestOnePairTie extends TestCase {
	public TestOnePairTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_one_pair_tie.txt");

	//tests two one pair hands with different pairs
	public void testDifferentPair() {
		List<Card> Pair1 = hands.get(0).getDeck();
		
		List<Card> Pair2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(2, Pair1, Pair2));
	}
	
	//tests two one pair hands with same pairs
	public void testSamePair() {
		List<Card> Pair1 = hands.get(2).getDeck();
		
		List<Card> Pair2 = hands.get(3).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(2, Pair1, Pair2));
	}
}
