package builder;

// User1 , we are filling he values of all fields.
// User2 , we are missing out the values of optional fields.
public class ViolateBuilder {
    public static void main(String[] args) {
        User user1 = new User("Hari", "Venkatesh", "hari@gmail.com", 25, "8610658014", "Madurai", "Female",
                "Software Developer");
        User user2 = new User("Testing", "User", null, 0, null, null, null, null);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }

}

class User {
    // Required fields
    private String firstName;
    private String lastName;
    private String email;

    // Optional Fields
    private int age;
    private String phone;
    private String address;
    private String gender;
    private String occupation;

    // Contructor with multiple fields and few optional fields can be confusing and
    // not readable.
    public User(String firstName, String lastName, String email,
            int age, String phone, String address,
            String gender, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    // For printing
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

}
