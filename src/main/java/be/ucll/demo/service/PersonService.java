package be.ucll.demo.service;

import java.util.ArrayList;

import be.ucll.demo.domain.Person;

public class PersonService {
    private ArrayList<Person> persons = new ArrayList<>();

    public PersonService() {
        persons.add(new Person("Christiaans", "Chris", 7));
        persons.add(new Person("Daniels", "Dina", 11));
        persons.add(new Person("Everts", "Ernst", 15));
    }

    public boolean contains(Person person) {
        return persons.contains(person);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public boolean delete(Person person) {
        return getPersons().remove(person);
    }

    public boolean add(Person person) {
        if (contains(person))
            return false;
        return getPersons().add(person);
    }

    public Person getOldest() {
        if (getPersons().size() == 0)
            return null;
        Person temp = getPersons().get(0);
        for (int i = 1; i < getPersons().size(); i++) {
            if (persons.get(i).getAge() > temp.getAge())
                temp = getPersons().get(i);
        }
        return temp;
    }

    public ArrayList<Person> getPersonsWithNameContaining(String s) {
        if (getPersons().isEmpty())
            return null;
        ArrayList<Person> temp = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(s))
                temp.add(person);
        }
        return temp;
    }

}
