/**
 * Created by Lora on 1/27/16.
 */
import org.apache.log4j.*;

public class LoggingExample {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public LoggingExample() {

        log.trace("Trace Message");


    }
}
