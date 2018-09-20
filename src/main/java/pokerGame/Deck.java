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
                this.cards.add(new Card());
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
}
