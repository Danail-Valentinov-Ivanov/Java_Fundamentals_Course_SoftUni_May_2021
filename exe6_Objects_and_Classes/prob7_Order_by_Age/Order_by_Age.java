package exe6_Objects_and_Classes.prob7_Order_by_Age;

public class Order_by_Age {
    String name;
    String id;
    int age;

    public Order_by_Age(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    //Stephan with ID: 524244 is 10 years old.
    @Override
    public String toString() {
        return getName() + " with ID: " + getId() + " is " + getAge() + " years old.";
    }
}
