import com.example.controller.TestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        System.out.println("Hello");
        logger.info("This is an info log message.");
    }
}
