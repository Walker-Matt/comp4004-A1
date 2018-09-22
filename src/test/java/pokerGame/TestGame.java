package pokerGame;

import junit.framework.*;
import java.util.*;

public class TestGame extends TestCase {
	public TestGame(String name) {
		super(name);
	}
	
	//test the initial game setup values
	public void testGameSetup() {
		Game game = new Game();
		game.main();
		
		assertTrue(game.deck instanceof Deck);
		
		assertTrue(game.river instanceof List<?>);
		assertTrue(game.river.get(0) instanceof Card);
		assertEquals(3, game.river.size());
		
		assertTrue(game.cardsToBeat instanceof List<?>);
		assertTrue(game.cardsToBeat.get(0) instanceof Card);
		assertEquals(2, game.cardsToBeat.size());
		
		assertTrue(game.AIPcards instanceof List<?>);
		assertTrue(game.AIPcards.get(0) instanceof Card);
		assertEquals(2, game.AIPcards.size());
		
		assertEquals(45, game.deck.size());
	}
}
