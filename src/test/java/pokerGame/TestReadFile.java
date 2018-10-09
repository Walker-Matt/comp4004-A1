package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestReadFile extends TestCase {
	public TestReadFile(String name) {
		super(name);
	}
	
	//test for file with only one game
	public void testReadOne() {
		List<Deck> deck = new ArrayList<Deck>();
		deck = ReadFile.read("cards/full_deck.txt");
		assertEquals(1, deck.size());
		assertEquals(52, deck.get(0).getSize());
	}
	
	//test for file with more than one game
	public void testReadMultiple() {
		List<Deck> deck = new ArrayList<Deck>();
		deck = ReadFile.read("cards/game_of_suits.txt");
		assertEquals(4, deck.size());
		assertEquals(13, deck.get(0).getSize());
		assertEquals(13, deck.get(1).getSize());
		assertEquals(13, deck.get(2).getSize());
		assertEquals(13, deck.get(3).getSize());
	}
}
