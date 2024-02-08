package W5codingAssignment;

public class APP {
	
	public static void main (String[] args) {
		
		//instantiating the instance of AsteriskLogger
		Logger AsteriskLogger = new AsteriskLogger();
		
		//testing logger method
		AsteriskLogger.log("Hello");
		
		//testing error method
		AsteriskLogger.error("Accident");
		
		
		//instantiating the instance of SpacedLogger
		Logger SpacedLogger = new SpacedLogger();
		
		//testing logger method
		SpacedLogger.log("Hi Kailoni");
		
		//testing error method 
		SpacedLogger.error("Accident");
		
	}
	
}
