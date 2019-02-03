package week01.perimeter;

import edu.duke.Point;
import edu.duke.Shape;
import org.junit.Test;
import week01.Quiz.PerimeterAssignmentRunner;

import static org.junit.Assert.assertEquals;

public class PerimeterRunnerTest {

    @Test
    public void testPerimeterOne () {
        PerimeterRunner runner = new PerimeterRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(-1,3));
        shape.addPoint(new Point(-1,-1));
        shape.addPoint(new Point(4,-1));
        shape.addPoint(new Point(1,3));

        assertEquals(16.0, runner.getPerimeter(shape),0);

    }

    @Test
    public void testPerimeterTwo () {
        PerimeterRunner runner = new PerimeterRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(4,3));
        shape.addPoint(new Point(2,-3));
        shape.addPoint(new Point(-4,-4));
        shape.addPoint(new Point(-2,-3));
        shape.addPoint(new Point(-4,2));
        shape.addPoint(new Point(-2,5));

        assertEquals(30.0, runner.getPerimeter(shape),0.5);

    }

    @Test
    public void testPerimeterThree () {
        PerimeterRunner runner = new PerimeterRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(-4,-6));
        shape.addPoint(new Point(-4,-1));
        shape.addPoint(new Point(-4,-3));

        assertEquals(10.0, runner.getPerimeter(shape),0.5);

    }

    @Test
    public void testPerimeterFour () {
        PerimeterRunner runner = new PerimeterRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(-3,4));
        shape.addPoint(new Point(-3,-4));
        shape.addPoint(new Point(3,-4));

        assertEquals(24.0, runner.getPerimeter(shape),0.5);

    }

    @Test
    public void getPerimeterTest_one() {
        PerimeterAssignmentRunner par = new PerimeterAssignmentRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(5, -2));
        shape.addPoint(new Point(-2, -3));
        shape.addPoint(new Point(-3, 5));
        shape.addPoint(new Point(5, 5));

        assertEquals(30, par.getPerimeter(shape), 0.5);
    }

    @Test
    public void getNumPoints_one() {
        PerimeterAssignmentRunner par = new PerimeterAssignmentRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(5, -2));
        shape.addPoint(new Point(-2, -3));
        shape.addPoint(new Point(-3, 5));
        shape.addPoint(new Point(5, 5));

        assertEquals(4, par.getNumPoints(shape), 0.5);
    }

    @Test
    public void getNumPoints_two() {
        PerimeterAssignmentRunner par = new PerimeterAssignmentRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(-3, 9));
        shape.addPoint(new Point(-8, 7));
        shape.addPoint(new Point(-12, 4));
        shape.addPoint(new Point(-6, -2));
        shape.addPoint(new Point(-4, -6));
        shape.addPoint(new Point(2, -8));
        shape.addPoint(new Point(6, -5));
        shape.addPoint(new Point(10, -3));
        shape.addPoint(new Point(8, 5));
        shape.addPoint(new Point(4, 8));

        assertEquals(10, par.getNumPoints(shape), 0.5);
    }

    @Test
    public void getAverageLength_one() {
        PerimeterAssignmentRunner par = new PerimeterAssignmentRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(5, -2));
        shape.addPoint(new Point(-2, -3));
        shape.addPoint(new Point(-3, 5));
        shape.addPoint(new Point(5, 5));

        assertEquals(7.5, par.getAverageLength(shape), 0.5);
    }

    //
    @Test
    public void getLargestSide_one() {
        PerimeterAssignmentRunner par = new PerimeterAssignmentRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(5, -2));
        shape.addPoint(new Point(6, -4));
        shape.addPoint(new Point(6, 2));

        assertEquals(6.0, par.getLargestSide(shape), 0.5);
    }

    //


}
