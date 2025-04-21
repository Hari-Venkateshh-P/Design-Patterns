package builder.withbuilder;

public class BuilderPatternImpl {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Hari", "Venkatesh", "hari@gmail.com")
                .age(25)
                .address("Madurai")
                .gender("Male")
                .occupation("Software Developer")
                .build();
        User user2 = new User.UserBuilder("Testing", "User", "test@gmail.com").build();
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

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.gender = builder.gender;
        this.occupation = builder.occupation;
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

    public static class UserBuilder {
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

        public UserBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder occupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
