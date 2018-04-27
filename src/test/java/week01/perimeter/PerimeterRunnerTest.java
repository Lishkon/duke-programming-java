package week01.perimeter;

import edu.duke.Point;
import edu.duke.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerimeterRunnerTest {

    @Test
    public void testPerimeter () {
        PerimeterRunner runner = new PerimeterRunner();
        Shape shape = new Shape();
        shape.addPoint(new Point(-1,3));
        shape.addPoint(new Point(-1,-1));
        shape.addPoint(new Point(4,-1));
        shape.addPoint(new Point(1,3));

        assertEquals(16.0, runner.getPerimeter(shape),0);





    }
}
