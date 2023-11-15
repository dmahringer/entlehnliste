package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    Person person;

    @Before
    public void setup() {
        person = new Person();
    }
    
    @Test
    public void given_person_when_name_is_John() {
        person.setName("John");
        assertEquals("John", person.getName());
    }
}
