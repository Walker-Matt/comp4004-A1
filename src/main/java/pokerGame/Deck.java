package pokerGame;

import java.io.*;
import java.util.*;

public class Deck {
	protected List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		
		String fileName = "cards.txt";
		String line = null;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null) {
                this.cards.add(new Card(Character.toString(line.charAt(0)), line.substring(1)));
            }
            bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");               
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
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
