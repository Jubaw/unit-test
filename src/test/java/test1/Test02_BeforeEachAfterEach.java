package test1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_BeforeEachAfterEach {

    String str;


    @BeforeEach
    void beforeEach() {
        str = "JUnit";
        System.out.println("Before each runs");
    }

    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("After each runs");
    }

    @Test
    void testUppercase(){
        String actual = str.toUpperCase();
        String expected = "JUNIT";

        assertEquals(expected,actual);
    }

    @Test
    void testContains(){
        boolean actual = str.contains("a");
        boolean expected = false;
        assertEquals(expected,actual);
        //**********************OR***********************
        assertEquals(false,str.contains("a"));
        //**********************OR***********************
        assertFalse(str.contains("u")); //If it doesnt contain the param value, it passes.
        assertTrue(str.contains("U")); //If it does contain the param value, it passes.

    }


}
