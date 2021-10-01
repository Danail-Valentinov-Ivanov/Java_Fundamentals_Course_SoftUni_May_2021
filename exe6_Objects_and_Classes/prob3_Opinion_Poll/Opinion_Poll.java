package exe6_Objects_and_Classes.prob3_Opinion_Poll;

public class Opinion_Poll {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Opinion_Poll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getAge();
    }
}
