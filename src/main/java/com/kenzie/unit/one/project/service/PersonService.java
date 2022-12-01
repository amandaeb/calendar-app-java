package com.kenzie.unit.one.project.service;

import com.kenzie.unit.one.project.backend.Backend;
import com.kenzie.unit.one.project.comparator.SortByPersonName;
import com.kenzie.unit.one.project.models.Person;
import com.kenzie.unit.one.project.models.PersonDto;

import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.sort;

public class PersonService {

    private final Backend backend;

    public PersonService(Backend backend) {
        this.backend = backend;
    }

    public List<Person> getPersons() {
        List<PersonDto> response = backend.getPersons();
        List<Person> listPersons = new ArrayList<>();
        for (PersonDto personDto : response) {
            Person person = Person.builder()
                    .setPersonId(personDto.getPersonId())
                    .setPersonName(personDto.getPersonName())
                    .build();
            listPersons.add(person);
        }
        Comparator<Person> personsComparator = new SortByPersonName();
        Collections.sort(listPersons, personsComparator);
        return listPersons;
    }

    public Person addPerson(String personName) {
        PersonDto response = backend.addPerson(personName);
        Person person = Person.builder()
                .setPersonId(response.getPersonId())
                .setPersonName(response.getPersonName())
                .build();
        return person;
    }
}
