/**
 * Created by rajashrk on 8/24/17.
 */
public class HummingBird implements Flyable {

    private String  currentLocation;
    public HummingBird() {
    }

    @Override
    public void fly() {
        currentLocation = "in the air";
        System.out.println("currently" + currentLocation);
    }


}
