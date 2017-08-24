/**
 * Created by rajashrk on 8/2/17.
 */
public class AreaCalculator {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square square = new Square(6);
        Object[] shapes = new Object[2];

        shapes[0] = circle;
        shapes[1] = square;

        Double sumOfAreas = 0.0;

        for (int count = 0; count < shapes.length; count++) {
            Object shape = shapes[count];
            if (shape.getClass() == Circle.class) {
                Circle circleObj = (Circle) shape;
                sumOfAreas = sumOfAreas + circleObj.area();
            }
            if (shape.getClass() == Square.class) {
                Square squareObj = (Square) shape;
                sumOfAreas = sumOfAreas + squareObj.area();
            }
        }

        System.out.println("Area of all shapes = " + sumOfAreas);
    }
}
