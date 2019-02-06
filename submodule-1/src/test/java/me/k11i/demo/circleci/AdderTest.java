package me.k11i.demo.circleci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    @Test
    void testAdd() {
        assertEquals(3, Adder.add(1, 2));
    }
}