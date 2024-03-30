package newConcepts;

import java.util.logging.Logger;

public class LoggerExample {

	private static Logger logger = Logger.getLogger(LoggerExample.class.getName());

	public static void main(String[] args) {

		System.out.println("Hello World");

		logger.severe("This is a severe message");
		logger.warning("This is a warning message");
		logger.info("This is an info message");
		logger.config("This is a config message");
		logger.fine("This is a fine message");
		logger.finer("This is a finer message");
		logger.finest("This is a finest message");

		System.out.println("Completed");
	}
}

