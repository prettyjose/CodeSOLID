/**
 * Created by rajashrk on 8/2/17.
 */
public class Main {

    public static void main(String []args) {
        Rectangle rect = new Rectangle();
        rect.setLength(2.0);
        rect.setWidth(2.0);

        System.out.println("Rectangle width = " + rect.getWidth() +  ", length = " + rect.getLength());

        Rectangle specialRectangle = new Square();
        specialRectangle.setLength(5.0);
        specialRectangle.setWidth(3.0);

        System.out.println("Rectangle width = " + specialRectangle.getWidth() +  ", length = " + specialRectangle.getLength());

    }
}
