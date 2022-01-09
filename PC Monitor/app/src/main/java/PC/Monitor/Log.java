package PC.Monitor;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Log {
    Logger logger = Logger.getLogger("PC.Monitor");
    boolean hasLogFile = true;   
    Log (){
        try{
            FileHandler handler = new FileHandler("default.log", true);
            logger.addHandler(handler);
        }
        catch (Exception e){
            System.out.println("Failure while trying to configure the log handler");
        }    
        
    }

    public void info (String message){
        logger.info(message);
    }
    
    public void error (String message){
        logger.severe(message);
    } 
}

