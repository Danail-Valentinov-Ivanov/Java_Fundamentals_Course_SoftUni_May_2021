package lab6_Objects_and_Classes.prob5_Students;

public class Students {
//    first name, last name, age and
//    hometown.
    private String firstName;
    private String lastName;
    private String age;
    private String hometown;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public Students(String firstName, String lastName, String age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public void setAge(String age) {
        this.age= age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
