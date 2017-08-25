import util.EmailValidator;

/**
 * Created by rajashrk on 8/24/17.
 */
public class Main {
    private static final String VALID = "valid";
    private static final String INVALID = "invalid";

    public static void main(String[] args) {
        String emailId = "praveena@gmai.com";
        String validityString = EmailValidator.isValidEmailId(emailId) ? VALID: INVALID;
        System.out.println("You email Id is " +  validityString);
        Person person;
        System.out.println("Going to create a person with the details given....");
        if(VALID.equals(validityString)){
            person = new Person("Praveena",23,"Female",emailId);
        }


    }
}
