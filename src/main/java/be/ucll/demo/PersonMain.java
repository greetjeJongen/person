package be.ucll.demo;

import be.ucll.demo.domain.Person;

public class PersonMain {
    public static void main(String[] args) {
        int id = (int) (Math.random() * 1000);
        String name = "Anthonis";
        String firstName = "Anne";
        int age = 25;
        Person person = new Person(name, firstName, age);
        person.setId(id);
        System.out.println(person.toString());
    }

}
