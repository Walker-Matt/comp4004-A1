package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestDeck extends TestCase {
	public TestDeck(String name) {
		super(name);
	}
	
	//test getter for a Decks list of Cards
	public void testDeckGetDeck() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		assertTrue(d.getDeck() instanceof List<?>);
	}
	
	//test size of Decks list of Cards
	public void testDeckGetSize() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		assertEquals(52, d.getSize()); //Should have 52 cards
	}
	
	//test draw method in Deck
	//test draw method with input of 1
	//test draw method returns List
	//test draw method returns List Card types
	public void testDeckDraw() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		assertEquals(1, d.draw(1).size());
		assertEquals(51, d.getSize());
		assertTrue(d.draw(1) instanceof List<?>);
		assertTrue(d.draw(1).get(0) instanceof Card);
	}

	//test draw method with input of 0
	public void testDeckDraw0() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		List<Card> drawn = d.draw(0);
		assertEquals(0, drawn.size());
		assertEquals(52, d.getSize());
	}
	
	//test draw method with input of -1
	public void testDeckDrawNeg1() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		assertEquals(0, d.draw(-1).size());
		assertEquals(52, d.getSize());
	}
	
	//test draw method with more than 52 at once
	public void testDeckDraw53AtOnce() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		assertEquals(52, d.draw(53).size());
		assertEquals(0, d.getSize());
	}
	
	//test draw method with input of 52
	//test draw method with more that 52 separately
	public void testDeckDraw53Separate() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		assertEquals(52, d.draw(52).size());
		assertEquals(0, d.getSize());
		assertEquals(0, d.draw(1).size());
		assertEquals(0, d.getSize());
	}
	
	//test shuffle method in Deck
	//test shuffle method doesn't change number of cards
	//test shuffle method actually shuffles the cards
	public void testDeckShuffle() {
		Deck d = ReadFile.read("cards/full_deck.txt").get(0);
		List<Card> before = new ArrayList<Card>();
		List<Card> after = new ArrayList<Card>();
		before.addAll(d.getDeck());
		d.shuffle();
		after.addAll(d.getDeck());
		assertEquals(before.size(), after.size());
		int diff = 0;
		for(int i=0; i < d.getSize(); i++) {
			if(before.get(i).getSuit() != after.get(i).getSuit()
			|| before.get(i).getRank() != after.get(i).getRank()) {
				diff += 1;
			}
		}
		assertTrue(diff > 0);
	}
}
