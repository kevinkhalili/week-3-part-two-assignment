package finalproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//player fields
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	//default constructor
	public Player() {
		score = 0;
	}
	
	//user defined constructor
	public Player(String name) {
		this.name = name;
		score = 0;
	}
	//display cards names
	public void describe() {
		
		System.out.println("The player cards: " + name);
		
		for (Card myHand: hand) {
			myHand.describe();
		}
		
	}
	//showing the top card 
	public Card flip(){
		//removes and returns the top card of the Hand
				
//		Card myCard = hand.get(0);
//		hand.remove(myCard);
//		return myCard;
		//a simpler version of above code
		return hand.remove(0);
	}
	
	public void draw (Deck deck) {
		//takes a Deck as an argument and calls the 
		//draw method on the deck, adding theplayerOne.flip().getValue() > playerTwo.flip().getValue()
		//returned Card to the hand field
		hand.add(deck.draw());
	}
	//adds one to the score
	public int incrementScore() {
		//adds 1 to the player's score field		
		return score++;
	}
	
	//getters and setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
