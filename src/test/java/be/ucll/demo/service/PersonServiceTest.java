package be.ucll.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.ucll.demo.domain.Person;

public class PersonServiceTest {
    private PersonService personService;
    private Person aPersonAnne, aPersonBert;

    @BeforeEach
    public void setUp() {
        personService = new PersonService();
        aPersonAnne = new Person("Anthonis", "Anne", 25);
        aPersonBert = new Person("Bertrand", "Bert", 40);
    }

    @Test
    public void when_no_persons_are_added_getPersons_is_empty() {
        assertEquals(0, personService.getPersons().size());
    }

    @Test
    public void when_no_persons_delete_returns_false() {
        assertFalse(personService.delete(new Person()));
    }

    @Test
    public void when_no_persons_add_person_not_in_list_then_person_is_in_list() {
        assertTrue(personService.add(aPersonAnne));
        assertEquals(1, personService.getPersons().size());
        assertTrue(personService.contains(aPersonAnne));
    }

    @Test
    public void when_anne_is_added_twice_then_anne_is_only_once_in_list_and_add_returns_false() {
        personService.add(aPersonAnne);
        assertFalse(personService.add(aPersonAnne));
        assertEquals(1, personService.getPersons().size());
        assertTrue(personService.contains(aPersonAnne));
    }

    @Test
    public void when_anne_and_bert_in_list_then_bert_is_oldest() {
        personService.add(aPersonAnne);
        personService.add(aPersonBert);
        assertEquals(aPersonBert, personService.getOldest());
    }

}
