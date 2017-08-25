/**
 * Created by rajashrk on 8/2/17.
 */
public class Square/* extends PerpendicularQuadrilateral-NOT REQUIRED as context doesn't ask for it and as it's error prone*/ {

    private Double sideLength;

    public Square(Double sideLength) {
        this.sideLength = sideLength;
        }

    public void printSideLength(){
        System.out.println("Square side length = " + this.sideLength);
    }


}
