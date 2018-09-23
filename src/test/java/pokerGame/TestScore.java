package pokerGame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestScore extends TestCase {
	public TestScore(String name) {
		super(name);
	}
	
	//test score method in Score
	public void testScore() {
		List<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("H", "10"));
		royalFlush.add(new Card("H", "J"));
		royalFlush.add(new Card("H", "Q"));
		royalFlush.add(new Card("H", "K"));
		royalFlush.add(new Card("H", "A"));
		
		List<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("H", "4"));
		straightFlush.add(new Card("H", "5"));
		straightFlush.add(new Card("H", "6"));
		straightFlush.add(new Card("H", "7"));
		straightFlush.add(new Card("H", "8"));
		
		List<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card("S", "4"));
		FourOfAKind.add(new Card("H", "4"));
		FourOfAKind.add(new Card("C", "4"));
		FourOfAKind.add(new Card("D", "4"));
		FourOfAKind.add(new Card("S", "3"));
		
		List<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card("S", "4"));
		FullHouse.add(new Card("H", "4"));
		FullHouse.add(new Card("C", "4"));
		FullHouse.add(new Card("D", "7"));
		FullHouse.add(new Card("S", "7"));
		
		List<Card> Flush = new ArrayList<Card>();
		Flush.add(new Card("S", "4"));
		Flush.add(new Card("S", "J"));
		Flush.add(new Card("S", "9"));
		Flush.add(new Card("S", "7"));
		Flush.add(new Card("S", "3"));
		
		List<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card("S", "4"));
		Straight.add(new Card("H", "5"));
		Straight.add(new Card("C", "6"));
		Straight.add(new Card("D", "7"));
		Straight.add(new Card("S", "8"));
		
		List<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card("S", "4"));
		ThreeOfAKind.add(new Card("H", "4"));
		ThreeOfAKind.add(new Card("C", "4"));
		ThreeOfAKind.add(new Card("D", "7"));
		ThreeOfAKind.add(new Card("S", "3"));
		
		List<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card("S", "4"));
		TwoPair.add(new Card("H", "4"));
		TwoPair.add(new Card("C", "9"));
		TwoPair.add(new Card("D", "9"));
		TwoPair.add(new Card("S", "3"));
		
		List<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card("S", "4"));
		Pair.add(new Card("H", "4"));
		Pair.add(new Card("C", "9"));
		Pair.add(new Card("D", "7"));
		Pair.add(new Card("S", "3"));
		
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		assertEquals(139, Score.score(royalFlush));
		assertEquals(125, Score.score(straightFlush));
		assertEquals(111, Score.score(FourOfAKind));
		assertEquals(84, Score.score(FullHouse));
		assertEquals(79, Score.score(Flush));
		assertEquals(69, Score.score(Straight));
		assertEquals(55, Score.score(ThreeOfAKind));
		assertEquals(28, Score.score(TwoPair));
		assertEquals(14, Score.score(Pair));
		assertEquals(1, Score.score(HighCard));
	}
	
	//test cardScore method in Score
	public void testCardScore() {
		List<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card("S", "4"));
		HighCard.add(new Card("H", "J"));
		HighCard.add(new Card("C", "9"));
		HighCard.add(new Card("D", "7"));
		HighCard.add(new Card("S", "3"));
		
		assertEquals(10, Score.highCardScore(HighCard));
	}
	
	//test suitScore method in Score
}
