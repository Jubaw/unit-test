package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test01_Assertion {


    @Test //A test method and it can be run
    public void test() {

    }


    //Lets test String class length() method.
    @Test
    void testLength() {
        String str = "Hello Wrld!";
        int trueValue = str.length(); //12
        int expectedValue = 12;
        assertEquals(trueValue,expectedValue,"Different length");



    }


    //Math addExact
    @Test
    void testAddExact(){
        int trueValue = Math.addExact(5,8);
        int expectedValue = 13;
        int notExpected = 15;

        assertEquals(expectedValue,trueValue);
        assertNotEquals(notExpected,trueValue);
    }


}
