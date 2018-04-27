package week01.perimeter;

import edu.duke.*;

/**
 * @author alychak
 * @url http://www.dukelearntoprogram.com/course2/doc/
 * @url https://www.coursera.org/learn/java-programming/lecture/cI1Vw/seven-steps-in-action-translating-to-code
 * */

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        double totalPerim = 0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
        }
        return totalPerim;
    }
}
