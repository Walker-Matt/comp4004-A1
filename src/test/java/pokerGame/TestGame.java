package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestGame extends TestCase {
	public TestGame(String name) {
		super(name);
	}
	
	//test the initial game setup values
	public void testGameSetup() {
		String[] args = new String[0];
		Game.main(args);
		
		assertTrue(Game.deck instanceof Deck);
		
		assertTrue(Game.river instanceof List<?>);
		assertTrue(Game.river.get(0) instanceof Card);
		assertEquals(3, Game.river.size());
		
		assertTrue(Game.cardsToBeat instanceof List<?>);
		assertTrue(Game.cardsToBeat.get(0) instanceof Card);
		assertEquals(2, Game.cardsToBeat.size());
		
		assertTrue(Game.AIPcards instanceof List<?>);
		assertTrue(Game.AIPcards.get(0) instanceof Card);
		assertEquals(2, Game.AIPcards.size());
		
		assertEquals(45, Game.deck.getSize());
	}
	
	//test String values used for display
	public void testGameDisplay() {
		String[] args = new String[0];
		Game.main(args);
		
		String river = "RIVER: " + Game.river.get(0).toString() + " " +
				Game.river.get(1).toString() + " " +
				Game.river.get(2).toString() + "\n";
		String cardsToBeat = "Cards to beat: " + Game.cardsToBeat.get(0).toString() +
				" " + Game.cardsToBeat.get(1).toString() + "\n";
		String AIPcards = "AIP cards: " + Game.AIPcards.get(0).toString() + " " +
				Game.AIPcards.get(1).toString()+ "\n";
		
		assertEquals(river, Game.riverDisplay);
		assertEquals(cardsToBeat, Game.cardsToBeatDisplay);
		assertEquals(AIPcards, Game.AIPcardsDisplay);
	}
}
