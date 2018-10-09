package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFourOfAKindTie extends TestCase {
	public TestFourOfAKindTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_four_of_a_kind_tie.txt");

	//tests two four of a kind hands
	public void testTie() {
		List<Card> FourOfAKind1 = hands.get(0).getDeck();
		
		List<Card> FourOfAKind2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(8, FourOfAKind1, FourOfAKind2));
	}
}
