package Day13_Log4j_SeleniumExceptions_ExtentReport;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogHomeWork {

   /* Tasktaki her bir step icin lutfen log mesajlarini yazdirarak ilerleyiniz :)
    Go to URL: https://healthunify.com/bmicalculator/
    Entring weight
    Selecting kilograms
    Selecting height in feet
    Selecting height in inchs
    Clicking on calculate
    Getting SIUnit value
    Getting USUnit value
    Getting UKUnit value
    Getting overall description*/



    public static void main(String[] args) {












        PropertyConfigurator.configure("log4j.properties");
        Logger logger = LogManager.getLogger(C01_Log4jDemo.class.getName());

        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Error");
        logger.fatal("Fatal");







    }
}
