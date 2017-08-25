/**
 * Created by rajashrk on 8/24/17.
 */
public class Penguin implements Swimmable{

    private String  currentLocation;

    public Penguin() {

    }

    @Override
    public void swim() {
        currentLocation = "water";
        System.out.println("currently am at " + currentLocation);
    }
}
