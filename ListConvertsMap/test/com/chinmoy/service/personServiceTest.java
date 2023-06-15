package com.chinmoy.service;
import com.chinmoy.domain.Person;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class personServiceTest {

    private personService Service;
    private List<Person> people;

    @BeforeEach
    public void setUp() {
        Service = new personService();
        people = Service.generateList();
    }

    @Test
    @DisplayName("Transform List to Map")
    public void testTransform() {
        Map<Float, Person> map = Service.transform(people);
        assertNotNull(map);
        assertEquals(3, map.size());

        assertEquals("Rajib", map.get(1.0f).getName());
        assertEquals("Rab", map.get(1.1f).getName());
        assertEquals("Raj", map.get(1.2f).getName());

        assertTrue(map.containsKey(1.0f));
        assertTrue(map.containsKey(1.1f));
        assertTrue(map.containsKey(1.2f));
    }

    @Test
    @DisplayName("Show List")
    public void testShowList() {
        Service.show(people);
    }

    @Test
    @DisplayName("Show Map")
    public void testShowMap() {
        Map<Float, Person> map = Service.transform(people);
        Service.show(map);
    }

}
