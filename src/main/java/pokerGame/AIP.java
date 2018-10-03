package pokerGame;

import java.util.*;

public class AIP {
	List<Card> discard = new ArrayList<Card>();
	List<Card> drawn = new ArrayList<Card>();
	
	//implements simple strategy for exchanging cards
 	public List<Card> exchange(List<Card> hand) {
		if(Hands.type(hand) >= 5) {
			return hand;
		} else if()
	}
}
