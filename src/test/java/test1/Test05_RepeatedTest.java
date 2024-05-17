package test1;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test05_RepeatedTest {


    //For continuous test;

    @RepeatedTest(5)
    void testSubstring() {
        assertEquals("Java", "Java is beautiful".substring(0, 4));

    }
    //Repeated tests are usually done for random values

    @RepeatedTest(100)
    void testAddExact() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        assertEquals(num1 + num2, Math.addExact(num1, num2));

        System.out.println("Num1: " + num1 + "------ num2: " + num2);


    }


}
