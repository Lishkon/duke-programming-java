package week01.Quiz;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import edu.duke.Point;
import edu.duke.Shape;

import java.io.File;
import java.util.*;

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
        double totalPerim = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
        }
        return Math.floor(totalPerim);
    }

    /**
     * Complete writing the method <code>getNumPoints</code> that has one parameter s
     *
     * @param s  Given shape
     * @return countPoints type
     * */
    public int getNumPoints (Shape s) {
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
        DirectoryResource dr = new DirectoryResource();
        List<Double> perimetersStored = new ArrayList<>();

        for (File f: dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currentPerimeter = getPerimeter(s);
            perimetersStored.add(currentPerimeter);
        }

        return perimetersStored
                .stream()
                .mapToDouble(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
    }

    /**
     * This method should, like the getLargestPerimeterMultipleFiles method, create its own Directory Resource,
     * except that this new method returns the File that has the largest such perimeter, so it has return type File.
     * @return the corresponding value
     * */
    public File getFileWithLargestPerimeter() {
        DirectoryResource dr = new DirectoryResource();
        TreeMap<File, Double> perimeters = new TreeMap<>();

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape shape = new Shape(fr);
            perimeters.put(f, getPerimeter(shape));
        }

        return perimeters.lastKey();


    }

    /**
     * This method is doing following:
     * <ol>
     *     <li>Runs <i><b>getNumPoints</b></i> method and prints the result to console</li>
     *     <li>Runs <i><b>getAverageLength</b></i> method and prints the result to console</li>
     *     <li>Runs <i><b>getLargestSide</b></i> method and prints the result to console</li>
     *     <li>Runs <i><b>getLargestX</b></i> method and prints the result to console</li>
     *     <li>Runs <i><b>getPerimeter</b></i> method and prints the result to console</li>
     * </ol>
     * */
    public void testPerimeter () {

        FileResource fr = new FileResource();
        Shape s = new Shape(fr);

        System.out.println("The amount of points is: " + getNumPoints(s));
        System.out.println("The average length is: " + getAverageLength(s));
        System.out.println("The largest side is: " + getLargestSide(s));
        System.out.println("The largest X is: " + getLargestX(s));
        System.out.println("perimeter = " + getPerimeter(s));
    }

    public void testPerimeterMultipleFiles() {
        System.out.println(getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        File f = getFileWithLargestPerimeter();
        System.out.println(f.getName());
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
        pr.testFileWithLargestPerimeter();
    }
}
