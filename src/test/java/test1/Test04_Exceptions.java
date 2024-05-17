package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test04_Exceptions {


    @Test
    void testLengthException(){
        String str="Hello World!";
        String str2=null;

        assertThrows(NullPointerException.class,()-> {
                    System.out.println("testException çalıştı.");
                    str2.length();
                }
        );

        assertDoesNotThrow(()->str.length());
    }

    @Test
    void testDivide(){
        int num1 = 8;
        int num2 = 0;
        assertThrows(ArithmeticException.class,()->{
            System.out.println(num1/num2);
        });
    }




}
