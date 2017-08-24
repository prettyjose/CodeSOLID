/**
 * Created by rajashrk on 8/2/17.
 */
public class Rectangle {

    private Double length;
    private Double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }
}
