package exe6_Objects_and_Classes.prob5_Students;

public class Student {
    String firstName;
    String secondName;
    double grade;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getGrade() {
        return grade;
    }

    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }
}
