package me.k11i.demo.circleci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {
    @Test
    void testMultiply() {
        assertEquals(6, Multiplier.multiply(2, 3));
    }
}
