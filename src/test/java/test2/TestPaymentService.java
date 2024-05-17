package test2;

import mockito1.PaymentManager;
import mockito1.PaymentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestPaymentService {

    //checkPaymentStatus method test: Positive scenario

    @Test
    void testCheckPaymentStatus() {

        //1-Mock Payment Manager Object
        PaymentManager pm = mock(PaymentManager.class); //Fake Pm
        //Mock PM'a davranış şekillerini set etmeliyiz.
        when(pm.getPaymentStatus(123)).thenReturn("SUCCESS");

        //2-Payment Service Object
        PaymentService paymentService = new PaymentService(pm);
       String actual =  paymentService.checkPaymentStatus(123);

       assertEquals("STATUS : SUCCESS",actual );
       verify(pm.getPaymentStatus(123));

    }


}
