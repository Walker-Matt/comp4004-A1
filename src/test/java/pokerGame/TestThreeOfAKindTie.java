package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestThreeOfAKindTie extends TestCase {
	public TestThreeOfAKindTie(String name) {
		super(name);
	}

	//tests two three of a kind hands
	public void testTie() {
		List<Card> ThreeOfAKind1 = new ArrayList<Card>();
		ThreeOfAKind1.add(new Card("S", "4"));
		ThreeOfAKind1.add(new Card("H", "4"));
		ThreeOfAKind1.add(new Card("C", "4"));
		ThreeOfAKind1.add(new Card("D", "7"));
		ThreeOfAKind1.add(new Card("S", "3"));
		
		List<Card> ThreeOfAKind2 = new ArrayList<Card>();
		ThreeOfAKind2.add(new Card("S", "5"));
		ThreeOfAKind2.add(new Card("H", "5"));
		ThreeOfAKind2.add(new Card("C", "5"));
		ThreeOfAKind2.add(new Card("D", "7"));
		ThreeOfAKind2.add(new Card("S", "3"));
		
		assertEquals("AIP wins.", Tie.settleThreeOfAKind(ThreeOfAKind1, ThreeOfAKind2));
	}
}
