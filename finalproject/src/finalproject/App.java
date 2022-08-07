package finalproject;

public class App {

	public static void main(String[] args) {
		// declaring constants
		final int HALFOFDECKOFCARD = 26;
		final int TOTALDECKOFCARD = 52;
		//instantiating objects
		Deck myDeck = new Deck();		
		Player playerOne = new Player("One");
		Player playerTwo = new Player("Two");
		//shuffling a deck of card
		myDeck.shuffle();
		
		//dividing cards between two players
		for (int i = 0; i < TOTALDECKOFCARD; i++) {
			if ( i % 2 == 0) {
				playerOne.draw(myDeck);
			}else {
				playerTwo.draw(myDeck);
			}			
		}
		//each player flip their card
		for (int i = 0; i < HALFOFDECKOFCARD; i++) {
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();
				//check the face value of each card to see how is scoring 
				if(playerOneCard.getValue() > playerTwoCard.getValue()) {
					playerOne.incrementScore();
				}else { 
					playerTwo.incrementScore();
		
				}
			}		
		//prints out who is wining  
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player One score is: " + playerOne.getScore() +   
					"\nplayer Two Score is: " + playerTwo.getScore() + "\n" + "Plaer One wins." );
		}else if (playerOne.getScore() < playerTwo.getScore()) { 
				System.out.println("Player One score is: " + playerOne.getScore() +  
						"\nplayer Two Score is: " + playerTwo.getScore() + "\n" + "Plaer Two wins." );
		}else {
				System.out.println("Player One score is: " + playerOne.getScore() + 
						"\nplayer Two Score is: " + playerTwo.getScore() + "\n" + "Draw" );
	}	
						

	}

}
