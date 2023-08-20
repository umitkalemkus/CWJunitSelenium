package UmitPractice.HomePage.Umityeni;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {

    public static void main(String[] args) {

        Logger  logger = Logger.getLogger(Log4jDemo.class.getName());

        PropertyConfigurator.configure("log4j.properties");



       logger.warn("Error message");
       logger.debug("Debug message");
       logger.info("Info message");
       logger.error("Error message");
       logger.fatal("Fatal message");
       logger.trace("Trace message");








    }


}
