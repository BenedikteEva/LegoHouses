package BusinessLayer;

/**
 * The purpose of BenedikteEvasNewException is to send a message to user of 
 * the system that something went wrong.
 * @author kasper
 */
public class BenedikteEvasNewException extends Exception {

    public BenedikteEvasNewException(String ErrorMsg) {
        super(ErrorMsg);
      
    }
    

}
