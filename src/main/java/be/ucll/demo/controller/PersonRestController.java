package be.ucll.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ucll.demo.domain.Person;

@RestController
@RequestMapping("api/person")
public class PersonRestController {
    public Person person = new Person("Anthonis", "Anne", 20);

    @GetMapping("/view")
    private Person view_person() {
        return person;
    }
}
