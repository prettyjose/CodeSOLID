/**
 * Created by rajashrk on 8/24/17.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    private Email emailAddress;

    public Person(String name, int age, String gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emailAddress = new Email(emailAddress);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Email getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void changeEmailAddress(String emailAddress) {
        this.emailAddress.setEmailId(emailAddress);
    }


}
