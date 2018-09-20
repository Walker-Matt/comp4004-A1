package pokerGame;

import java.util.*;

public class Deck {
	protected List<Card> cards;
	
	public List<Card> getDeck() {
		cards = new ArrayList<Card>();
		return cards;
	}
}
