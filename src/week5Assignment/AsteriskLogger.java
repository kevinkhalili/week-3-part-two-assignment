package week5Assignment;

public class AsteriskLogger implements Lagger {

	@Override
	public void logMessage(String log) {
		// TODO Auto-generated method stub
		//puts 3 asterisks on either side of any string variable
		System.out.println("***" + log + "***");  
	}

	@Override
	public void errorMessage(String error) {
		// TODO Auto-generated method stub
		//makes a box of asterisks surrounded on any string variable
		System.out.println("******************");
        System.out.println("***Error: " + error + "***");
        System.out.println("******************");
    }	
}
