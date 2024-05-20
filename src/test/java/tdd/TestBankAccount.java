package tdd;

    /*
        ***********************************
               Banka Hesap Uygulamasi
        ***********************************
        Uygulamada yazilacak metodlar:
            *   Hesap Olusturma
            *   Para Cekme ( Bakiye yetersiz kontrolu, Gunluk Cekim Limiti Kontrolu, Negatif Giris kontrolu )
            *   Para Yatirma ( Negatif Giris kontrolu )
            *   Hesap Gecmisi Alabilme kontrolu
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {

    //Hesap oluşturma
    @Test
    void testCreateAccount() {
        BankAccount account = new BankAccount("12345", 0.0, 1000.0);
        assertNotNull(account);
        assertEquals("12345", account.getAccountNumber());
        assertEquals(0.0, account.getBalance());
        assertEquals(1000.0, account.getDailyWithdrawLimit());
    }

    //Para yatırma testleri
    @Test
    void testDeposit() {
        //given
        BankAccount account = new BankAccount("12345", 100.0, 1000.0);
        int size = account.getHistory().size();

        //when
        account.deposit(200.0);//balance+200

        //then
        assertEquals(300.0, account.getBalance());
        assertEquals(size + 1, account.getHistory().size());
    }

    //pozitif olmayan miktar ile para yatırma testi
    @Test
    void testDepositWithNonPositiveAmount() {

        BankAccount account = new BankAccount("12345", 100.0, 1000.0);
        int size = account.getHistory().size();

        assertThrows(RuntimeException.class, () -> account.deposit(-100));
        assertEquals(100.0, account.getBalance());
        assertEquals(size, account.getHistory().size());
    }

    //Para çekme testleri
    @Test
    void testWithdraw() {

        BankAccount account = new BankAccount("12345", 300.0, 1000.0);
        int size = account.getHistory().size();


        assertTrue(account.withdraw(200.0));
        assertEquals(100.0, account.getBalance());
        assertEquals(size + 1, account.getHistory().size());

    }


    //Yetersiz bakiye
    @Test
    void testWithdrawWithInsufficentBalance() {
        BankAccount account = new BankAccount("12345", 500.0, 1000.0);
        int size = account.getHistory().size();

        assertFalse(account.withdraw(600.0));
        assertEquals(500.0, account.getBalance());
        assertEquals(size, account.getHistory().size());

    }

    //Limit aşım engeli

    @Test
    void testDailyWithdrawLimit() {
        BankAccount account = new BankAccount("12345", 1500.0, 1000.0);
        int size = account.getHistory().size();
        assertTrue(account.withdraw(1000.0));

        assertFalse(account.withdraw(500.0));

        assertEquals(500.0, account.getBalance());

        assertEquals(size + 1, account.getHistory().size());
    }

    //Pozitif olmayan miktarda para çekme
    @Test
    void testNegativeWithdraw() {
        BankAccount account = new BankAccount("12345", 1500.0, 1000.0);
        int size = account.getHistory().size();

        assertFalse(account.withdraw(-200));

        assertEquals(1500, account.getBalance());

        assertEquals(size, account.getHistory().size());


    }

    //İşlem geçmişini alma

    @Test
    void testGetHistory() {
        BankAccount account = new BankAccount("12345", 1500.0, 1000.0);
        int size = account.getHistory().size();

        account.withdraw(200); // + 1
        account.deposit(500); // + 1

        assertEquals(size + 2, account.getHistory().size());
        assertTrue(account.getHistory().contains("Deposit : " + 500.0));
        assertTrue(account.getHistory().contains("Withdraw : " + 200.0));


    }

}
