package week01.Quiz;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import edu.duke.Point;
import edu.duke.Shape;

import java.io.File;

/**
 * @author alychak
 * @date 4/30/2018
 * @since 4/30/2018
 *
 * @url https://www.coursera.org/learn/java-programming/supplement/s3GE0/calculating-the-perimeter-of-a-shape
 *
 * */


public class PerimeterAssignmentRunner {
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
     * Complete writing the method <code><getNumPoints/code> that has one parameter s
     *
     * @param s is of type <code>Shape</code>.
     * @return integer that is the number of points in Shape s.
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
     * Complete writing the method getAverageLength that has one parameter s that is of type Shape.
     * This method returns a number of type double that is the calculated average of all the sides’
     * lengths in the Shape S.
     * */
    public double getAverageLength(Shape s) {
        // Put code here
        return getPerimeter(s) / getNumPoints(s);
    }


    /**
     * Complete writing the method getLargestSide that has one parameter s that is of type Shape.
     * This method returns a number of type double that is the longest side in the Shape S.
     * */
    public double getLargestSide(Shape s) {
        // Put code here
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
     * Complete writing the method getLargestX that has one parameter s that is of type Shape.
     * This method returns a number of type double that is the largest x value over all the points in the Shape s.
     * */

    public double getLargestX(Shape s) {
        // Put code here
        return 0.0;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    /**
     * 1. Add code to call getNumPoints and to print the result.
     * 2. Add code to call the method getAverageLength and to print out the result.
     *    Note if you were to select the file example1.txt, then the average side length should be 4.0.
     * 3. Add code to call the method getLargestSide and to print out the result.
     *    Note if you were to select the file example1.txt, then the longest side should be 5.0.
     * 4. Add code in the method testPerimeter to call the method getLargestX and to print out the result.
     *    Note if you were to select the file example1.txt, then the longest side should be 4.0.
     * */
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);

        // Using the getNumPoints method, return the amount of points you receive
        int totalPointsNum = getNumPoints(s);
        System.out.println("The amount of points is: " + totalPointsNum);

        // The result of getAverageLength method
        double averageLength = getAverageLength(s);
        System.out.println("The avarage length is: " + averageLength);

        // The result of getLargestSide method
        System.out.println("The largest side is: " + getLargestSide(s));


        // The length is
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
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

    // This method prints names of all files in a chosen folder that you can use to test your other methods
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
