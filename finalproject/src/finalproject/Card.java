package finalproject;

public class Card {
	//Data members of Card class
	private int value;
	private String name;
	 		
	//initializing cards value of 2 to 14 
	public Card( int value, String suit) {
		
		this.value = value;
		
		switch(value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
		default:
			name = "This is not a valid card";
			break;
		}
		name = name + "of" + suit;
								
	}
	
	//shows the value and the name of the card
	public void describe() {
		System.out.println("The name of the card is: " + name 
				+ "The value of the card is: " + value);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Card name= " + name + ", value=" + value;
	}
}
