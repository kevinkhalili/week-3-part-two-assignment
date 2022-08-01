package week5Assignment;
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//creating logInfo object
		Lagger logInfo = new AsteriskLogger();
		//performing logMessage method on logInfo object
		logInfo.logMessage("Hello");
		System.out.println();
		//performing errorMessage method on logInfo object
		logInfo.errorMessage("Hello");			
		System.out.println();
		
		//creating spacedInfo object
		Lagger spacedInfo = new SpacedLogger();
		//performing logMessage method on spacedInfo object
		spacedInfo.logMessage("Hello");
		System.out.println();
		//performing errorMessage method on spacedInfo object
		spacedInfo.errorMessage("Hello");		
		System.out.println();
	}
}
