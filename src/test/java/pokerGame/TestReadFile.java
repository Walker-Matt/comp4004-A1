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
		deck = ReadFile.read("full_deck.txt");
		assertEquals(1, deck.size());
		assertEquals(52, deck.get(0).getSize());
	}
}
