package W5codingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("*******************");
		System.out.println("ERROR: " + message);
		System.out.println("*******************");
	}

}
