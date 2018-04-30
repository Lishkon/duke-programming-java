package week01.perimeter;

import edu.duke.Point;
import edu.duke.Shape;
import org.junit.Test;

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

}
