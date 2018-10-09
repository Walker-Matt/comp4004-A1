package pokerGame;

import java.io.*;
import java.util.*;

public class ReadFile {
	protected static List<Deck> games;
	
	public static List<Deck> read(String fileName) {
		games = new ArrayList<Deck>();
		
		String line = null;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null) {
				List<Card> cards = new ArrayList<Card>();
				String[] split = line.split(" ");
				for(int i=0; i < split.length; i++) {
					String card = split[i];
					cards.add(new Card(card.substring(0, 1), card.substring(1)));
				}
                Deck newDeck = new Deck(cards);
                games.add(newDeck);
			}
            bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");               
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
		
		return games;
	}
}
