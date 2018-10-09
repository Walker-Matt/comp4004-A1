package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestStraightTie extends TestCase {
	public TestStraightTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_straight_tie.txt");
	
	//tests two straight hands with different high cards
	public void testDifferentHighCards() {
		List<Card> Straight1 = hands.get(0).getDeck();
		
		List<Card> Straight2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(5, Straight1, Straight2));
	}
	
	
	//tests two straight hands with same high cards
	public void testSameHighCards() {
		List<Card> Straight1 = hands.get(2).getDeck();
		
		List<Card> Straight2 = hands.get(3).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(5, Straight1, Straight2));
	}
}
