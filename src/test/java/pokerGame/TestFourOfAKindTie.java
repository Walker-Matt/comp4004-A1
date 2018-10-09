package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestFourOfAKindTie extends TestCase {
	public TestFourOfAKindTie(String name) {
		super(name);
	}

	//tests two four of a kind hands
	public void testTie() {
		List<Card> FourOfAKind1 = new ArrayList<Card>();
		FourOfAKind1.add(new Card("S", "4"));
		FourOfAKind1.add(new Card("H", "4"));
		FourOfAKind1.add(new Card("C", "4"));
		FourOfAKind1.add(new Card("D", "4"));
		FourOfAKind1.add(new Card("S", "2"));
		
		List<Card> FourOfAKind2 = new ArrayList<Card>();
		FourOfAKind2.add(new Card("S", "5"));
		FourOfAKind2.add(new Card("H", "5"));
		FourOfAKind2.add(new Card("C", "5"));
		FourOfAKind2.add(new Card("D", "5"));
		FourOfAKind2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settle(8, FourOfAKind1, FourOfAKind2));
	}
}
