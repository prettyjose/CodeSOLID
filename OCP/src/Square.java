/**
 * Created by rajashrk on 8/2/17.
 */
public class Square implements Shape{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }
}
