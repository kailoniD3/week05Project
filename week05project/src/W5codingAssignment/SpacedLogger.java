package W5codingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message ) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i) + " ");
		}
		System.out.println();
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: ");
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i) + " ");
	}
		System.out.println();
}
}