package com.kea;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {



    @org.junit.jupiter.api.Test
    void getFirstName() {
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Person p = new Person ("Janus","Pedersen");

        String result = p.toString();
        assertTrue(result.contains("Janus"));
        assertFalse(result.equals("sdf"));
    }
}