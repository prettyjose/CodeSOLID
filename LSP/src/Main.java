/**
 * Created by rajashrk on 8/2/17.
 */
public class Main {

    public static void main(String []args) {
        Rectangle rect = new Rectangle(2.0, 5.0);
        rect.printDimensions();

        /*  PerpendicularQuadrilateral rect = new Rectangle();
            PerpendicularQuadrilateral specialRectangle = new Square();
            is error prone because a user may do
            specialRectangle.setLength(5); and specialRectangle.setWidth(10);
            In this case, retained values will be width=length=10, which is not expected.
            So it's better to have Square and Rectangle as non-related classes, in terms of dimensions to avoid error.
            If there is a context for you to have a common interface, add so.
            If there is no such use case, refrain from making such a relation just for the sake of logic.
        */

        Square square = new Square(10.0);
        square.printSideLength(); //TELL; don't ASK FOR THINGS. print() than get() and print here.


    }
}
