package pl.doderslab.examples.TestLog4J;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	final static Logger logger = Logger.getLogger(App.class);


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.error("Program przestał działać, bo się przegrzał");
        
        //musieliśmy wrzucić plik z konfiguracją do 
        // /home/adam/workspace/TestLog4J/target/classes/
        
    }
}
