/**
 * Created by rajashrk on 8/2/17.
 */
public class Rectangle/* extends PerpendicularQuadrilateral-NOT REQUIRED as context doesn't ask for it and as it's error prone*/{

    private Double length;
    private Double width;



    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public void printDimensions(){
        System.out.println("Rectangle width = " + this.width +  ", length = " + this.length);
    }



}
