package com.chinmoy.service;

import com.chinmoy.domain.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class personService {
    public List<Person> generateList(){

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Rajib", 50000f));
        people.add(new Person(1, "Rab", 40000f));
        people.add(new Person(1, "Raj", 35000f));

        return people;
    }

    public Map<Float, Person> transform(List<Person> people) {
        Map<Float, Person> map = new HashMap<>();
        for (Person person : people) {
            Float id = Float.valueOf(person.getId());
            while (map.containsKey(id)) {
                id += 0.1f;
            }
            map.put(id, person);
        }
        return map;
    }

    public void show(List<Person> people) {
        System.out.println("Person list:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void show(Map<Float, Person> map) {
        System.out.println("Person map:");
        for (Float key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

}

