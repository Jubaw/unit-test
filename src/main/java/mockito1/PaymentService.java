package mockito1;

public class PaymentService {


        /*
        Senaryo

    Senaryo: PaymentService sınıfı, bir ödeme geçmişi tutan bir PaymentHistoryManager sınıfına bağımlıdır.
    PaymentService, ödeme geçmişini kontrol etmek için PaymentHistoryManager'ı kullanır. Bizim test
    senaryomuzda, PaymentService'in checkPaymentStatus metodunu test edeceğiz ve PaymentHistoryManager'ın
    gerçek bir örneğini kullanmak yerine mock bir nesneyle değiştireceğiz.

         */

    private PaymentManager pm;

    public PaymentService(PaymentManager pm) {
        this.pm = pm;
    }

    public String checkPaymentStatus(int id){
        String str = "STATUS : ";
        String status = pm.getPaymentStatus(id);
        return str + status;
    }


}



