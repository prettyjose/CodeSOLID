/**
 * Created by rajashrk on 8/2/17.
 */
public class Square extends Rectangle {


    @Override
    public void setLength(Double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(Double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
