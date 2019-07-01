/**
 * The type Divide by zero exception.
 */
public class DivideByZeroException extends Exception {

	/**
	 * Instantiates a new Divide by zero exception.
	 */
	public DivideByZeroException() {
		super("Dividing by Zero!"); // Divide by zero catch class
	}

	/**
	 * Instantiates a new Divide by zero exception.
	 *
	 * @param message the message
	 */
	public DivideByZeroException(String message) {
		super(message);
	}

}
