package mockito1;

public class PaymentManager {
    //  Payment history status

    public String getPaymentStatus(int paymentID) {
        //123,456
        if (paymentID == 123) {
            return "Success";
        } else if (paymentID == 456) {
            return "Failure";
        } else {
            return "Unknown";
        }
    }





}
