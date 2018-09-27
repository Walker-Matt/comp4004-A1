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
		
		assertTrue(Game.cardsToBeat instanceof List<?>);
		assertTrue(Game.cardsToBeat.get(0) instanceof Card);
		assertEquals(5, Game.cardsToBeat.size());
		
		assertTrue(Game.AIPcards instanceof List<?>);
		assertTrue(Game.AIPcards.get(0) instanceof Card);
		assertEquals(5, Game.AIPcards.size());
		
		assertEquals(42, Game.deck.getSize());
	}
	
	//test String values used for display
	public void testGameDisplay() {
		String[] args = new String[0];
		Game.main(args);
		
		String cardsToBeat = "Cards to beat: " + 
				Game.cardsToBeat.get(0).toString() + " " +
				Game.cardsToBeat.get(1).toString() + " " +
				Game.cardsToBeat.get(2).toString() + " " +
				Game.cardsToBeat.get(3).toString() + " " +
				Game.cardsToBeat.get(4).toString() + "\n";
		String AIPcards = "AIP cards: " + 
				Game.AIPcards.get(0).toString() + " " +
				Game.AIPcards.get(1).toString() + " " +
				Game.AIPcards.get(2).toString() + " " +
				Game.AIPcards.get(3).toString() + " " +
				Game.AIPcards.get(4).toString()+ "\n";
		
		String handTypes = Game.getHandsDisplay() + "\n";
		
		String winner = Game.getWinner() + "\n";
		
		assertEquals(cardsToBeat, Game.cardsToBeatDisplay);
		assertEquals(AIPcards, Game.AIPcardsDisplay);
		assertEquals(handTypes, Game.handsDisplay);
		assertEquals(winner, Game.winnerDisplay);
	}
	
	//test getWinner() method in Game
	public void testGameGetWinner() {
		String[] args = new String[0];
		Game.main(args);
		
		String winner = Game.getWinner();
		if(Hands.type(Game.cardsToBeat) > Hands.type(Game.AIPcards)) {
			assertEquals("AIP loses.", winner);
		} else if (Hands.type(Game.cardsToBeat) < Hands.type(Game.AIPcards)) {
			assertEquals("AIP wins.", winner);
		} else {
			String tie = Tie.settle(Hands.type(Game.cardsToBeat), Game.cardsToBeat, Game.AIPcards);
			assertEquals(tie, winner);
		}
	}
}
