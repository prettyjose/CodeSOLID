/**
 * Created by rajashrk on 8/24/17.
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Praveena",23,"Female","praveena@gmai.com");
        String validityString = person.isValidEmailId() ? "valid" : "invalid";
        System.out.println("You email Id is " +  validityString);
    }
}
