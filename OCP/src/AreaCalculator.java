import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajashrk on 8/2/17.
 */
public class AreaCalculator {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle(4);
        Square square = new Square(6);


        shapes.add(circle);
        shapes.add(square);

        Double sumOfAreas = 0.0;

        for(Shape shape:shapes){

            sumOfAreas += shape.area();

        }

        System.out.println("Area of all shapes = " + sumOfAreas);
    }
}
