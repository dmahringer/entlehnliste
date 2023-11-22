package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student student;

    @Before
    public void setup() {
        student = new Student();
    }
    
    @Test
    public void given_Student_then_is_instance_of_person() {
        assertTrue(student instanceof Person);
    }


    @Test 
    public void given_studentid_is_not_null(){
        student.setName("IT29182");
        assertEquals("IT29182",student.getName());
    }
}
