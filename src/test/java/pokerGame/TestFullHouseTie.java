package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFullHouseTie extends TestCase {
	public TestFullHouseTie(String name) {
		super(name);
	}
	
	List<Deck> hands = ReadFile.read("tests/test_full_house_tie.txt");

	//tests two full house hands
	public void testTie() {
		List<Card> FullHouse1 = hands.get(0).getDeck();
		
		List<Card> FullHouse2 = hands.get(1).getDeck();
		
		assertEquals("AIP wins.", Tie.settle(7, FullHouse1, FullHouse2));
	}
}
