package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddressTest {

    Address address;

    @Before
    public void setup() {
        address = new Address();
    }

    @Test
    public void testSetStreet() {
        address.setStreet("Limesstraße");
        assertEquals("Limesstraße", address.getStreet());
    }
}
