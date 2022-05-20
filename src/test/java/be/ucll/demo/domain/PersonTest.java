package be.ucll.demo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void when_input_is_valid_then_person_is_created() {
        int id = (int) (Math.random() * 1000);
        String name = "Anthonis";
        String firstName = "Anne";
        int age = 25;
        Person person = new Person(name, firstName, age);
        person.setId(id);
        assertEquals(id, person.getId());
        assertEquals(name, person.getName());
        assertEquals(firstName, person.getFirstName());
        assertEquals(age, person.getAge());
    }
}
