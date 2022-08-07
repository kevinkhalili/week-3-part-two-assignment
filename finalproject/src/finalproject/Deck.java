package finalproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	//declaring two lists one for the cards and one for the suits
	List<Card> cards = new ArrayList<>();
	List<String> suits = Arrays.asList("Dimonds", "Hearts", "Clubs", "Spades");
	
	
	//constructor for a deck of card
	public Deck() {
		
		for (int i = 0; i < 15; i++) {
			for(String suit: suits) {
				cards.add(new Card(i, suit));
			}
		}		
	}
	//randomizing the card
	public void shuffle() {
		Collections.shuffle(cards);			
	}
	//drawing the card
	public Card draw() {
		return cards.remove(0);		
	}
	//getters and setters
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}
