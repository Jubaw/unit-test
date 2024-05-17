package test1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test03_BeforeAllAfterAll {

    @BeforeAll
    static void beforeAll() {
        System.out.println("***beforeAll çalıştı");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll çalıştı***");
    }

    @Test
    void testSplit() {
        String[] actual = "JUnit is a unit test framework".split(" ");
        String[] expected = {"JUnit", "is", "a", "unit", "test", "framework"};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testMin() {
       int actual =  Math.min(8, 1);
       int expected = 1;
       assertEquals(expected,actual);
       assertTrue(actual == 1);
    }


}
