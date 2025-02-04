package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestTie extends TestCase {
	public TestTie(String name) {
		super(name);
	}
	
	//test settle method
	public void testTieSettle() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "10"));
		cardsToBeat.add(new Card("S", "J"));
		cardsToBeat.add(new Card("S", "Q"));
		cardsToBeat.add(new Card("S", "K"));
		cardsToBeat.add(new Card("S", "A"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("H", "10"));
		AIPcards.add(new Card("H", "J"));
		AIPcards.add(new Card("H", "Q"));
		AIPcards.add(new Card("H", "K"));
		AIPcards.add(new Card("H", "A"));
		
		assertEquals("AIP loses.", Tie.settle(10, cardsToBeat, AIPcards));
	}
	
	//test settleRoyalFlush method
	public void testTieSettleRoyalFlush() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "10"));
		cardsToBeat.add(new Card("S", "J"));
		cardsToBeat.add(new Card("S", "Q"));
		cardsToBeat.add(new Card("S", "K"));
		cardsToBeat.add(new Card("S", "A"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("H", "10"));
		AIPcards.add(new Card("H", "J"));
		AIPcards.add(new Card("H", "Q"));
		AIPcards.add(new Card("H", "K"));
		AIPcards.add(new Card("H", "A"));
		
		assertEquals("AIP loses.", Tie.settleSuit(cardsToBeat, AIPcards));
	}
	
	//test settleStraightFlush method
	public void testTieSettleStraightFlush() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("S", "5"));
		cardsToBeat.add(new Card("S", "6"));
		cardsToBeat.add(new Card("S", "7"));
		cardsToBeat.add(new Card("S", "8"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("H", "2"));
		AIPcards.add(new Card("H", "3"));
		AIPcards.add(new Card("H", "4"));
		AIPcards.add(new Card("H", "5"));
		AIPcards.add(new Card("H", "6"));
		
		assertEquals("AIP loses.", Tie.settleHighCardSuit(cardsToBeat, AIPcards));
	}
	
	//test settleFourOfAKind method
	public void testTieSettleFourOfAKind() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "J"));
		cardsToBeat.add(new Card("C", "J"));
		cardsToBeat.add(new Card("D", "J"));
		cardsToBeat.add(new Card("S", "J"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "4"));
		AIPcards.add(new Card("H", "4"));
		AIPcards.add(new Card("C", "4"));
		AIPcards.add(new Card("D", "4"));
		AIPcards.add(new Card("S", "7"));
		
		assertEquals("AIP loses.", Tie.settleHighCard(cardsToBeat, AIPcards));
	}
	
	//test settleFullHouse method
	public void testTieSettleFullHouse() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "J"));
		cardsToBeat.add(new Card("C", "J"));
		cardsToBeat.add(new Card("D", "J"));
		cardsToBeat.add(new Card("S", "4"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "4"));
		AIPcards.add(new Card("H", "4"));
		AIPcards.add(new Card("C", "4"));
		AIPcards.add(new Card("D", "7"));
		AIPcards.add(new Card("S", "7"));
		
		assertEquals("AIP loses.", Tie.settleThreeOfAKind(cardsToBeat, AIPcards));
	}
	
	//test settleFlush method
	public void testTieSettleFlush() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("S", "J"));
		cardsToBeat.add(new Card("S", "9"));
		cardsToBeat.add(new Card("S", "7"));
		cardsToBeat.add(new Card("S", "3"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("H", "4"));
		AIPcards.add(new Card("H", "J"));
		AIPcards.add(new Card("H", "9"));
		AIPcards.add(new Card("H", "7"));
		AIPcards.add(new Card("H", "3"));
		
		assertEquals("AIP loses.", Tie.settleFlush(cardsToBeat, AIPcards));
	}
	
	//test settleStraight (can use highCard method)
	public void testTieSettleStraight() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "5"));
		cardsToBeat.add(new Card("C", "6"));
		cardsToBeat.add(new Card("D", "7"));
		cardsToBeat.add(new Card("S", "8"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "2"));
		AIPcards.add(new Card("H", "3"));
		AIPcards.add(new Card("C", "4"));
		AIPcards.add(new Card("D", "5"));
		AIPcards.add(new Card("S", "6"));
		
		assertEquals("AIP loses.", Tie.settleHighCardSuit(cardsToBeat, AIPcards));
	}
	
	//test settleThreeOfAKind method
	public void testTieSettleThreeOfAKind() {
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "4"));
		cardsToBeat.add(new Card("H", "J"));
		cardsToBeat.add(new Card("C", "J"));
		cardsToBeat.add(new Card("D", "J"));
		cardsToBeat.add(new Card("S", "3"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "4"));
		AIPcards.add(new Card("H", "4"));
		AIPcards.add(new Card("C", "4"));
		AIPcards.add(new Card("D", "7"));
		AIPcards.add(new Card("S", "3"));
		
		assertEquals("AIP loses.", Tie.settleThreeOfAKind(cardsToBeat, AIPcards));
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
		
		assertEquals("AIP loses.", Tie.settleHighCardSuit(cardsToBeat, AIPcards));
	}
	
	//test triple() method
	public void testTieTriple() {
		List<Card> triple = new ArrayList<Card>();
		triple.add(new Card("S", "4"));
		triple.add(new Card("H", "J"));
		triple.add(new Card("C", "J"));
		triple.add(new Card("D", "J"));
		triple.add(new Card("S", "3"));
		
		assertEquals(10, Tie.triple(triple).getOrder());
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
