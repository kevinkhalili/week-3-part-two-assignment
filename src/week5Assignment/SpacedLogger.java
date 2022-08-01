package week5Assignment;
public class SpacedLogger implements Lagger {
	@Override
	public void logMessage(String log) {
		/*
		 * creating an instance of StringBuilder to store each 
		 * Character of log string variable including a space
		 * in between 
		 */
		StringBuilder str = new StringBuilder();			
		for(int i = 0; i < log.length(); i++) {
			str.append(log.charAt(i)).append(" ");				
		}
		//printing out the final word separated by a space		
		System.out.println(str);		
	}

	@Override
	public void errorMessage(String error) {
		/*
		 * creating an instance of StringBuilder to store each 
		 * Character of error string variable including a space
		 * in between 
		 */
		StringBuilder str = new StringBuilder();			
		for(int i = 0; i < error.length(); i++) {
			str.append(error.charAt(i)).append(" ");				
		}		
		/*
		 * printing out the final word separated by a space
		 * and prefixed by the word Error:	    
		 */
		System.out.println("Error: " + str);      
		
	}

}
