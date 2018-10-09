package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestHighCardTie extends TestCase {
	public TestHighCardTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_high_card_tie.txt");

	//tests two high card hands with same high card
	public void testTie() {
		List<Card> HighCard1 = hands.get(0).getDeck();
		
		List<Card> HighCard2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(1, HighCard1, HighCard2));
	}
}
