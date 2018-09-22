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
		
		String river = "RIVER: " + Game.river.get(0).getSuit() + Game.river.get(0).getRank() + " " +
				Game.river.get(1).getSuit() + Game.river.get(1).getRank() + " " +
				Game.river.get(2).getSuit() + Game.river.get(2).getRank() + "\n";
		String cardsToBeat = "Cards to beat: " + Game.cardsToBeat.get(0).getSuit() + Game.cardsToBeat.get(0).getRank() +
				" " + Game.cardsToBeat.get(1).getSuit() + Game.cardsToBeat.get(1).getRank() + "\n";
		String AIPcards = "AIP cards: " + Game.AIPcards.get(0).getSuit() + Game.AIPcards.get(0).getRank() + " " +
				Game.AIPcards.get(1).getSuit() + Game.AIPcards.get(1).getRank() + "\n";
		
		AssertEquals(river, Game.riverDisplay);
		AssertEquals(cardsToBeat, Game.cardsToBeatDisplay);
		AssertEquals(AIPcards, Game.AIPcardsDisplay);
	}
}
