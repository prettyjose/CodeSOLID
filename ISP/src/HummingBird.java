/**
 * Created by rajashrk on 8/24/17.
 */
public class HummingBird implements Bird {
    private String  currentLocation;

    public HummingBird() {
    }

    @Override
    public void fly() {
        currentLocation = "in the air";
        System.out.println("currently" + currentLocation);
    }

    @Override
    public void swim() {
        throw new  UnsupportedOperationException();
    }
}
