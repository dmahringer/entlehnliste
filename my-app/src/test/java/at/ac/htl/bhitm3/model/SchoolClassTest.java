package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SchoolClassTest {
    
    SchoolClass schoolClass;

    @Before
    public void setup() {
        schoolClass = new SchoolClass();
    }

    @Test
    public void given_schoolClass_when_counting_students_then_result_is_0() {
        assertEquals(0, schoolClass.getStudents().size());
    }
}
