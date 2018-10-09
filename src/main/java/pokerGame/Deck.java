package pokerGame;

import java.util.*;

public class Deck {
	protected List<Card> cards;
	
	public Deck(List<Card> input) {
		cards = input;
	}
	
	public List<Card> getDeck() { return cards; }
	public int getSize() { return cards.size(); }
	
	public List<Card> draw(int numberToDraw){
		List<Card> drawnCards = new ArrayList<Card>();
		for (int i = 0; i < numberToDraw; i++){
			if(cards.size() > 0) {
				drawnCards.add(cards.get(0));
				cards.remove(0);
			}
		}
		return drawnCards;
	}
	
	public void shuffle(){
		Random rand = new Random();
		for (int i = cards.size() - 1; i > 0; i--) {
			int random = rand.nextInt(i + 1);
			Card card = cards.get(random);
			cards.set(random, cards.get(i));
			cards.set(i, card);
		}
	}
}
