package com.kenzie.unit.one.project.comparator;

import com.kenzie.unit.one.project.models.Person;

import java.util.Comparator;

public class SortByPersonName implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getPersonName().compareToIgnoreCase(secondPerson.getPersonName());
    }
}
