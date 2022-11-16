 package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    public void depositTest() {
        //given
        Account deborahAccount = new Account();

        //when I deposit 5000
        deborahAccount.deposit(5000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();

        assertEquals(5000, deborahAccountBalance);
    }

    @Test
    public void depositTwiceTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 4000
        deborahAccount.deposit(4000);
        //when I deposit 2000
        deborahAccount.deposit(2000);

        //check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccount.getBalance());
    }

    @Test
    public void depositNegativeAmountTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 4000
        deborahAccount.deposit(4000);
        //when I deposit 2000
        deborahAccount.deposit(-2000);

        //check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccount.getBalance());
    }
}