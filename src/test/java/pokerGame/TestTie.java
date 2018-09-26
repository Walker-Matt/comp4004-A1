package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTie extends TestCase {
	public TestTie(String name) {
		super(name);
	}
	
	//test settle() method
	public void testTieSettle() {
		
	}
	
	//test highCard() method
	public void testTieHighCard() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		assertEquals(10, Tie.highCard(HighCard));
	}
	
	//test suitScore() method
	public void testTieSuitScore() {
		
	}
}
