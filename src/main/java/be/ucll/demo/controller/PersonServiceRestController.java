package be.ucll.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ucll.demo.domain.Person;
import be.ucll.demo.service.PersonService;

@RestController
@RequestMapping("api/persons")
public class PersonServiceRestController {

    private PersonService service = new PersonService();

    @GetMapping("/getAll")
    public ArrayList<Person> getAllPersons() {
        return service.getPersons();
    }

    @GetMapping("/getOldest")
    public Person getOldest() {
        return service.getOldest();
    }

}
