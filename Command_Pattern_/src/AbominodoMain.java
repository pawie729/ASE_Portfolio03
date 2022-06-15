import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Simply a main class that offers a command-line way of playing the
 * Tic-Tac-Toe game.
 * 
 * @author aarnott
 *
 */
public class AbominodoMain {
	
	public static void main(String[] args) throws Exception {
		AbominodoCommandInterpreter interpreter = new AbominodoCommandInterpreter();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		// Ctrl-Z terminates the program
	    while ((s = in.readLine()) != null) {
	    	interpreter.parseCommand(s);  
	  	}
	}

}
