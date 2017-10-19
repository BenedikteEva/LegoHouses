/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ejer
 */
public class ErrorMsg extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {
       String whatDoesMsgMeans= "It is short for message, and I have to write "
               + "something else here, before I turn this assignment in...";
        return whatDoesMsgMeans;
    }
    
}
