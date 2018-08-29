
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowDestroyer extends WindowAdapter {
	public void windowClosing(WindowEvent e) // end the program
	// and close the JFrame window, if the user clicks the window's
	// close-window button.
	{
		System.exit(0);
	}
}
