package week01.Quiz;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import edu.duke.Point;
import edu.duke.Shape;

import java.io.File;

/**
 * @author alychak <br>
 * See https://www.coursera.org/learn/java-programming/supplement/s3GE0/calculating-the-perimeter-of-a-shape
 * */
public class PerimeterAssignmentRunner {
    /**
     * Calculates the perimeter out of the given shape
     * @param   s       Given shape
     * @return  double  totalPerim
     * */
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    /**
     * Complete writing the method <code>getNumPoints</code> that has one parameter s
     *
     * @param s  Given shape
     * @return countPoints type
     * */
    public int getNumPoints (Shape s) {
        // Put code here
        int countPoints = 0;
        for (Point p : s.getPoints()) {
            countPoints++;
        }

        return countPoints;
    }


    /**
     * returns the calculated average of all the sides' lengths in the Shape s.
     *
     * @param   s   type: Shape
     * @return  the average counted by dividing getPerimeter() and getNumPoints()
     * */
    public double getAverageLength(Shape s) {
        return getPerimeter(s) / getNumPoints(s);
    }


    /**
     * Returns the longest side in the Shape s.
     * @param    s  Given shape
     * @return   double largestSide  Longest side of the shape
     * */
    public double getLargestSide(Shape s) {
        double largestSide = 0.0;
        Point lastPoint = s.getLastPoint();
        for (Point p: s.getPoints()) {
            double currSide = p.distance(lastPoint);
            if (currSide > largestSide) {
                largestSide = currSide;
            }
        }

        return largestSide;
    }

    /**
     * Returns the largest X value over all the points in the Shape s.
     * @param   s  Given shape
     * @return  double largestX the largest <code>x</code> coordinate
     * */
    public double getLargestX(Shape s) {
        double largestX = 0.0;
        for (Point p: s.getPoints()) {
            if (p.getX() > largestX) {
                largestX = p.getX();
            }
        }
        return largestX;
    }

    /**
     * Calculates the largest perimeter out of several files
     * @return double largestPerimeter
     * */
    public double getLargestPerimeterMultipleFiles() {
        // Still needs to be done
        double largestPerimeter = 0.0;
        return largestPerimeter;
    }

    /**
     * Parses the given directory and gets the file with the largest perimeter
     * @return the corresponding value
     * */
    public String getFileWithLargestPerimeter() {
        // Still needs to be done
        File temp = null;    // replace this code
        return temp.getName();
    }

    /**
     * This method is doing following:
     * <ol>
     *     <li>Runs <i><b>getNumPoints</b></i> method and to prints the result to console</li>
     *     <li>Runs <i><b>getAverageLength</b></i> method and to prints the result to console</li>
     *     <li>Runs <i><b>getLargestSide</b></i> method and to prints the result to console</li>
     *     <li>Runs <i><b>getLargestX</b></i> method and to prints the result to console</li>
     *     <li>Runs <i><b>getPerimeter</b></i> method and to prints the result to console</li>
     * </ol>
     * */
    public void testPerimeter () {

        FileResource fr = new FileResource();
        Shape s = new Shape(fr);

        System.out.println("The amount of points is: " + getNumPoints(s));
        System.out.println("The avarage length is: " + getAverageLength(s));
        System.out.println("The largest side is: " + getLargestSide(s));
        System.out.println("The largest X is: " + getLargestX(s));
        System.out.println("perimeter = " + getPerimeter(s));
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    /**
     * Creates a triangle that can be used to test other methods
     * */
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    /** Prints names of all files in a chosen folder that can be used to test other methods */

    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
