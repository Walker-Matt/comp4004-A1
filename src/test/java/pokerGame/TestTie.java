package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTie extends TestCase {
	public TestTie(String name) {
		super(name);
	}
	
	//test settleTwoPair method
	public void testTieSettleTwoPair() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "4"));
		cardsToBeat.add(new Card("C", "J"));
		cardsToBeat.add(new Card("D", "J"));
		cardsToBeat.add(new Card("S", "3"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "5"));
		AIPcards.add(new Card("H", "5"));
		AIPcards.add(new Card("C", "7"));
		AIPcards.add(new Card("D", "7"));
		AIPcards.add(new Card("S", "3"));
		
		assertEquals("AIP loses.", Tie.settleTwoPair(cardsToBeat, AIPcards));
	}
	
	//test settlePair() method
	public void testTieSettlePair() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "J"));
		cardsToBeat.add(new Card("C", "J"));
		cardsToBeat.add(new Card("D", "7"));
		cardsToBeat.add(new Card("S", "3"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "4"));
		AIPcards.add(new Card("H", "5"));
		AIPcards.add(new Card("C", "5"));
		AIPcards.add(new Card("D", "7"));
		AIPcards.add(new Card("S", "3"));
		
		assertEquals("AIP loses.", Tie.settlePair(cardsToBeat, AIPcards));
	}
	
	//test settleHighCard() method
	public void testTieSettleHighCard() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "J"));
		cardsToBeat.add(new Card("C", "9"));
		cardsToBeat.add(new Card("D", "7"));
		cardsToBeat.add(new Card("S", "3"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "4"));
		AIPcards.add(new Card("H", "5"));
		AIPcards.add(new Card("C", "9"));
		AIPcards.add(new Card("D", "7"));
		AIPcards.add(new Card("S", "3"));
		
		assertEquals("AIP loses.", Tie.settleHighCard(cardsToBeat, AIPcards));
	}
	
	//test twoPair() method
	public void testTieTwoPair() {
		List<Card> twoPair = new ArrayList<Card>();
		twoPair.add(new Card("S", "4"));
		twoPair.add(new Card("H", "4"));
		twoPair.add(new Card("C", "J"));
		twoPair.add(new Card("D", "J"));
		twoPair.add(new Card("S", "3"));
		
		assertEquals(10, Tie.twoPair(twoPair).getOrder());
	}
	
	//test pair() method
	public void testTiePair() {
		List<Card> pair = new ArrayList<Card>();
		pair.add(new Card("S", "4"));
		pair.add(new Card("H", "J"));
		pair.add(new Card("C", "J"));
		pair.add(new Card("D", "7"));
		pair.add(new Card("S", "3"));
		
		assertEquals(10, Tie.pair(pair).getOrder());
	}
	
	//test highCard() method
	public void testTieHighCard() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		assertEquals(10, Tie.highCard(HighCard).getOrder());
	}
	
	//test suitScore() method
	public void testTieSuitScore() {
		Card spade = new Card("S", "A");
		
		assertEquals(4, Tie.suitScore(spade));
	}
}
