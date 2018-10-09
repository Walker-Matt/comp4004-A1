package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestThreeOfAKindTie extends TestCase {
	public TestThreeOfAKindTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_three_of_a_kind_tie.txt");

	//tests two three of a kind hands
	public void testTie() {
		List<Card> ThreeOfAKind1 = hands.get(0).getDeck();
		
		List<Card> ThreeOfAKind2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(4, ThreeOfAKind1, ThreeOfAKind2));
	}
}
