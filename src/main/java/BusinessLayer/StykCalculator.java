/*
 * BenedikteEva
 * Lego Houses
 */
package BusinessLayer;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Ejer
 */
public class StykCalculator {

    StringBuilder sb = new StringBuilder();
    int totalLengtha[] = null;
    int totalLengthc[] = null;
    int totalWidthb[] = null;
    int totalWidthd[] = null;
    int totalBricks[] = new int[3];

    public int[] bondType1Side(int a) {

        int brickQtys[] = new int[3];
        brickQtys[0] = ((a) - ((a) % 4)) / 4;  //brick 2x4

        switch ((a % 4)) {
            case 3:

                brickQtys[1] = 1;                               // brick 2x2
                brickQtys[2] = 1;                               // brick 2x1
                return brickQtys;

            case 2:

                brickQtys[1] = 1;                               // brick 2x2
                brickQtys[2] = 0;                               // brick 2x1
                return brickQtys;

            case 1:

                brickQtys[1] = 0;                               // brick 2x2
                brickQtys[2] = 1;                               // brick 2x1
                return brickQtys;

            case 0:

                brickQtys[1] = 0;                               // brick 2x2
                brickQtys[2] = 0;                               // brick 2x1
                return brickQtys;

        }
        return brickQtys;
    }

    public StringBuilder bondType1TotalBricks(int h, int l, int w) {
        totalLengtha = bondType1Side(l);
        totalLengthc = bondType1Side(l);
        totalWidthb = bondType1Side(w - 4);
        totalWidthd = bondType1Side(w - 4);

        totalBricks[0] = h * (totalLengtha[0] + totalLengthc[0] + (totalWidthb[0]) + (totalWidthd[0]));
        totalBricks[1] = h * (totalLengtha[1] + totalLengthc[1] + (totalWidthb[1]) + (totalWidthd[1]));
        totalBricks[2] = h * (totalLengtha[2] + totalLengthc[2] + (totalWidthb[2]) + (totalWidthd[2]));

        return stykListeTabel(sb, totalLengtha, totalWidthb, totalLengthc, totalBricks);

    }


    public StringBuilder bondType2TotalBricks(int h, int l, int w) {
        totalLengtha = bondType1Side(l - 2);
        totalLengthc = bondType1Side(l - 2);
        totalWidthb = bondType1Side(w - 2);
        totalWidthd = bondType1Side(w - 2);

        totalBricks[0] = h * (totalLengtha[0] + totalLengthc[0] + (totalWidthb[0]) + (totalWidthd[0]));
        totalBricks[1] = h * (totalLengtha[1] + totalLengthc[1] + (totalWidthb[1]) + (totalWidthd[1]));
        totalBricks[2] = h * (totalLengtha[2] + totalLengthc[2] + (totalWidthb[2]) + (totalWidthd[2]));

        return stykListeTabel(sb, totalLengtha, totalWidthb, totalLengthc, totalBricks);
    }

    // her kan man sætte vinduer or døre i uden de store problemer. 
    
    public StringBuilder bondType3TotalBricks(int h, int l, int w) {
        totalLengtha = bondType1Side(l - 4);
        totalLengthc = bondType1Side(l - 4);
        totalWidthb = bondType1Side(w);
        totalWidthd = bondType1Side(w);

        totalBricks[0] = h * (totalLengtha[0] + totalLengthc[0] + (totalWidthb[0]) + (totalWidthd[0]));
        totalBricks[1] = h * (totalLengtha[1] + totalLengthc[1] + (totalWidthb[1]) + (totalWidthd[1]));
        totalBricks[2] = h * (totalLengtha[2] + totalLengthc[2] + (totalWidthb[2]) + (totalWidthd[2]));

        return stykListeTabel(sb, totalLengtha, totalWidthb, totalLengthc, totalBricks);
    }

    private StringBuilder stykListeTabel(StringBuilder sb1, int[] totalLengtha, int[] totalWidthb, int[] totalLengthc, int[] totalBricks) {
        StringBuilder stykliste = sb1.append("<table>\n");
        sb1.append("<tr>");
        sb1.append("<th>").append("Klodstype</th><th>side 1</th><th>side 2</th>)<th>side 3</th>"
                + "<th>side 4</th><th>Ialt x højde</th>");
        sb1.append("</tr>\n");
        sb1.append("<tr>");
        sb1.append("<th>").append("2x4</th><th>").append(totalLengtha[0]).append("</th><th>").append(totalWidthb[0]).append("</th><th>").append(totalLengthc[0]).append("</th><th>").append(totalWidthb[0]).append("</th><th>").append(totalBricks[0]).append(" </th>");
        sb1.append("</tr>\n");
        sb1.append("<tr>");
        sb1.append("<th>").append("2x2</th><th>").append(totalLengtha[1]).append("</th><th>").append(totalWidthb[1]).append("</th><th>").append(totalLengthc[1]).append("</th><th>").append(totalWidthb[1]).append("</th><th>").append(totalBricks[1]).append(" </th>");
        sb1.append("<tr>");
        sb1.append("<th>").append("2x1</th><th>").append(totalLengtha[2]).append("</th><th>").append(totalWidthb[2]).append("</th><th>").append(totalLengthc[2]).append("</th><th>").append(totalWidthb[2]).append("</th><th>").append(totalBricks[2]).append(" </th>");
        sb1.append("</tr>\n");
        sb1.append("</tr>\n");
        sb1.append("</table>\n");
        return stykliste;
    }
    
       public void forbandtChoice(int forbandt, int height, int length, int width, HttpServletRequest request) {
        
        
        if (forbandt == 1) {
            StringBuilder stykliste = bondType1TotalBricks(height, length, width);
            request.setAttribute("stykliste", stykliste);
         
        }
        if (forbandt == 2) {
            StringBuilder stykliste = bondType2TotalBricks(height, length, width);
            request.setAttribute("stykliste", stykliste);
        
        }
        if (forbandt == 3) {
            StringBuilder stykliste =bondType3TotalBricks(height, length, width);
            request.setAttribute("stykliste", stykliste);
           
        }
    }
    


}
