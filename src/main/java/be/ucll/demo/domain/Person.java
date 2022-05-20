package be.ucll.demo.domain;

public class Person {

    private int id;
    private String name;
    private String firstName;
    private int age;

    public Person(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String result = "";
        result += getFirstName() + " " + getName();
        result += "(age: " + getAge() + ")";
        return result;
    }

    public boolean equals(Person other) {
        return this.getName().equals(other.getName())
                && this.getFirstName().equals(other.getFirstName())
                && this.getAge() == other.getAge();
    }
}
