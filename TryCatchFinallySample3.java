import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchFinallySample3 {

private static Logger logger = Logger.getLogger(TryCatchFinallySample3.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);

		try {
			logger.warning("try");
			Integer.parseInt(args[0]);
		} catch (Exception e) {
			logger.severe("catch");
		} finally {
			logger.info("finally");
		}
	}

}
