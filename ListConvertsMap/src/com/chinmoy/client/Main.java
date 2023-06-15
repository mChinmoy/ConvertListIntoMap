package com.chinmoy.client;

import com.chinmoy.domain.Person;
import com.chinmoy.service.personService;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        personService service = new personService();
        List<Person> people = service.generateList();
        service.show(people);
        Map<Float, Person> map = service.transform(people);
        service.show(map);
    }
}
