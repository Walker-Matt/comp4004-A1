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
		
		assertEquals(cardsToBeat, Game.cardsToBeatDisplay);
		assertEquals(AIPcards, Game.AIPcardsDisplay);
	}
	
	//test getWinner() method in Game
	public void testGameGetWinner() {
		String[] args = new String[0];
		Game.main(args);
		
		List<Card> cardsToBeat = new ArrayList<Card>();
		cardsToBeat.add(new Card("S", "A"));
		cardsToBeat.add(new Card("S", "K"));
		cardsToBeat.add(new Card("S", "Q"));
		cardsToBeat.add(new Card("S", "J"));
		cardsToBeat.add(new Card("S", "10"));
		
		List<Card> AIPcards = new ArrayList<Card>();
		AIPcards.add(new Card("S", "2"));
		AIPcards.add(new Card("D", "3"));
		AIPcards.add(new Card("H", "4"));
		AIPcards.add(new Card("C", "5"));
		AIPcards.add(new Card("S", "6"));
		
		String winner = Game.getWinner(cardsToBeat, AIPcards);
		assertEquals("AIP loses.", winner);
	}
}
